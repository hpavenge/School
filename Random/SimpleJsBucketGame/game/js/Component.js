function component(width, height, image, x, y) {
    this.gamearea = myGameArea;
    this.width = width;
    this.height = height;
    this.speedX = 0;
    this.speedY = 0;
    this.x = x;
    this.y = y;
    this.update = function() {
        ctx = myGameArea.context;
        ctx.drawImage(image, this.x, this.y);
    }
    this.newPos = function() {
        this.x += this.speedX;
        this.y += this.speedY;
    }
}
