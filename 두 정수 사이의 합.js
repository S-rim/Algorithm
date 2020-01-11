function solution(a, b) {
    var answer = 0;

    if(a<b) 
        {
            for(var i=a; i<=b; i++)
                {
                answer +=a;
                a++;                    
                }
        }
    
    else if(a==b) answer = a;  
    
    else 
        {
            for(var i=b; i<=a; i++)
                {
                    answer +=b;
                    b++;
                }
        }
    return answer;
}