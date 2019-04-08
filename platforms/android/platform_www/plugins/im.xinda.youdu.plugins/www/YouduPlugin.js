cordova.define("im.xinda.youdu.plugins.YouduPlugin", function(require, exports, module) {
var exec = require('cordova/exec');

exports.setBuin = function(buin,callback){
    exec(callback, null, 'YouduPlugin', 'setBuin',[buin]);
}

exports.setServer = function(host1,host2,port,callback) {
    exec(callback, null, 'YouduPlugin', 'setServer',[host1,host2,port]);
}

exports.loginWithAccount = function(account,password,callback) {
    exec(callback,null,'YouduPlugin', 'loginWithAccount',[account,password]);
}

exports.getSessionList = function (success, error) {
    exec(success, error, 'YouduPlugin', 'getSessionList', []);
};

exports.gotoSession = function (arg0, success, error) {
    exec(success, error, 'YouduPlugin', 'gotoSession', [arg0]);
};

exports.gotoCreateSession = function (success, error) {
      exec(success, error, 'YouduPlugin', 'gotoCreateSession',[]);
};

});
