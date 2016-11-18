var myGamePlayer;
var PlayerImage = new Image();
PlayerImage.src = "images/hero.png";
var myGameEnemy;
var EnemyImage = new Image();
EnemyImage.src = "images/hero.png";
var score = 0;
var life = 5;
var background = new Image();
background.src = "";

function startGame() {
    myGameArea.start();
    myGamePlayer = new component(30, 30, PlayerImage, 450, 700);
    myGameEnemy = new component(30,30,EnemyImage,450,100);
}

function updateGameArea() {
    myGameArea.clear();
    var c = document.getElementById("myCanvas");
    var ctx = c.getContext("2d");
    ctx.drawImage(background, 0, 0);
    // player
    myGamePlayer.speedX = 0;
    myGamePlayer.speedY = 0;
    if (myGameArea.key && myGameArea.key == 37) {myGamePlayer.speedX = -8; } // left
    if (myGameArea.key && myGameArea.key == 39) {myGamePlayer.speedX = 8; } //right
    myGamePlayer.newPos();
    myGamePlayer.update();
    // enemy's
    myGameEnemy.y = myGameEnemy.y + 8;
    myGameEnemy.update();
    // if hit reset enemy and give score point
    if (
  		myGamePlayer.x <= (myGameEnemy.x + 32)
  		&& myGameEnemy.x <= (myGamePlayer.x + 32)
  		&& myGamePlayer.y <= (myGameEnemy.y + 32)
  		&& myGameEnemy.y <= (myGamePlayer.y + 32)
  	) {
      // Throw the monster somewhere on the screen randomly
    	myGameEnemy.x = 25 + (Math.random() * (400));
    	myGameEnemy.y = 100;
  		++score;
    }
    // monster passed player
    else if (myGameEnemy.y > myGamePlayer.y+100) {
      // Throw the monster somewhere on the screen randomly
      myGameEnemy.x = 25 + (Math.random() * (400));
      myGameEnemy.y = 100;
      --life;
    }
    // end game reset
    if (life == 0) {
      alert("Gameover, je score was: "+score);
      reset();
    }
    function reset(){
      life = 5;
      score = 0;
      background.src = "";
    }
    // Score
    ctx.fillStyle = "black";
    ctx.font = "24px Helvetica";
    ctx.textAlign = "left";
    ctx.textBaseline = "top";
    ctx.fillText("Score: " + score, 750, 45);
    // Life
    ctx.fillStyle = "Red";
    ctx.font = "24px Helvetica";
    ctx.textAlign = "left";
    ctx.textBaseline = "top";
    ctx.fillText("Life: " + life, 750, 80);

    // Easter Eggs
    // Easter Egg 1
    // Monster image
    var monsterImage = new Image();
    monsterImage.src = "images/monster.png";
    //unlock Easter Egg 1 on score points of ten
    if (score > 9) {
      background.src = "images/background.png";
      ctx.fillStyle = "Yellow";
      ctx.font = "24px Helvetica";
      ctx.textAlign = "left";
      ctx.textBaseline = "top";
      ctx.fillText("Unlocked Part 1: ", 730, 590);
      ctx.drawImage(monsterImage, 920, 590);
    }
}
