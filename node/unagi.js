'use strict';

process.stdin.on('data', function(chunk) {
    //ファイルからデータをすべて読み込んで改行ごとに配列に入れる
    var lines = chunk.toString().split('\n');
    //linesの中から最初の一行を取得して改行で区切る
    var param = lines.shift().split(' ').map(Number);
    var n = param[0];
    var m = param[1];
    var data = lines.slice(0, m);
    var seats = initial_seats(n);

    for (var i = 0; i < m; i++) {
      var hoge = data[i].split(' ').map(Number);
      execute(hoge[1] - 1, hoge[0], seats);
    }

    console.log(count(seats));



    function initial_seats(n) {
      var result = [];
      for (var i = 0; i < n; i++) {
        result.push(false)
      }
      return result;
    }

    function count(array) {
      var count = 0;
      for (var i = 0; i < array.length; i++) {
        if (array[i % array.length]) {
          count++;
        }
      }
      return count;
    }

    function execute(beginIndex, len, array) {
      if (isEmpty(beginIndex, len, array)) {
        sit(beginIndex, len, array);
      }
    }

    function sit(beginIndex, len, array) {
      for(var i = beginIndex; i < beginIndex + len; i++) {
        array[i % array.length] = true;
      }
    }

    function isEmpty(beginIndex, len, array) {
      for(var i = beginIndex; i < beginIndex + len; i++) {
        if (array[i % array.length]) {
          return false;
        }
      }
      return true;
    }
});

process.stdin.resume();
process.stdin.setEncoding('utf8');
