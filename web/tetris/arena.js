import GameManager from "./game-manager";

export default class Arena{
    constructor(){
        this._columns = GameManager.config._columns;
        this._lines = GameManager.config._lines;
        this.positions = {
            top: 0,
            left: 0
        }
    }
}