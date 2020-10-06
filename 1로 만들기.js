let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
let n = parseInt(input)

function dp(n) 
{
    let d = new Array();
    d[0] = 0;
    d[1] = 0;

    let min = 0;
    for(let i = 2; i <= n; i++)
    {
        let one = n;
        let two = n;
        let three = n;
            
        one = d[i-1] + 1;
        if(i%2 === 0)
        {
            two = d[i / 2] + 1;
        }
            
        if(i%3 === 0)
        {
            three = d[i / 3] + 1;
        }
        min = Math.min(one,two,three);
        d[i] = min;
    }

console.log(d[n]);
}
dp(n);