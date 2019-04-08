cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "im.xinda.youdu.plugins.YouduIMPlugin",
      "file": "plugins/im.xinda.youdu.plugins/www/YouduIMPlugin.js",
      "pluginId": "im.xinda.youdu.plugins",
      "clobbers": [
        "cordova.plugins.YouduIMPlugin"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.3",
    "im.xinda.youdu.plugins": "1.0.1"
  };
});