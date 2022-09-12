export default class GameManager{
    static start(config){
        window.addEventListener("load", GameManager._init);

    }
    static _init(){
        let canvas = document.getElementById("canvas");
        canvas.width = GameManager.config.width;
        canvas.height = GameManager.config.height;
    }
}
