process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (chunk) {
    var array = chunk.toString()
    .split('\n')[0]
    .split(' ');

    var tmp = 0;
    var o = {};
    array
    .map(function(v) {
        if(o[v] > 0) {
          o[v]++;
          array.splice(tmp,1);
        } else {
          o[v] = 1;
        }
        tmp++;
        return v;
    });
    var p = array.map(function(v) {
      
    });

    //TODO:できん
    console.log(array.map(function(hoge) {return hoge + ' ' + o.hoge;}));
});
