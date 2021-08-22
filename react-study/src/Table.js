import { useState } from "react";
const Table = () =>{
    //state를 배워봅시다.
    const [num,setNum] = useState("");
    //const특) 값이 안바뀐다.
    
    function changeNum(par){
        var Num = num;
        setNum(Num + par)
    }

    function eraseNum(){
        setNum("");
    }
    
    function calculate(){
    //    setNum(eval(num))
    }

    /*재미없는 이론시간
    웹 특징) 정적.. static.. =>이유 한페이지를 멀리서(서버) 다운받아서 니 컴퓨터(클라이언트)에 보여준다.
    페이지가 자주 바뀌려면 계속 다운받아야되잖아 오래걸리고, 기술적으로 불간응..
    
    요즘에들어서 나온 웹의 트렌드가 동적(dynamic)
    리액트.. (반응하다.) state단위로 쪼갰기 때문에 바뀐 모듈만 빠르게 다운받아온다.
    */

    //review "map, state"


    return(
        //반복생기는거 보기싫을때 => 반복문.. for / while / foreach do while
        //html부분에서 javascript변수를 가지고오고싶다..  {_} 

        <div>
            <input value={num}></input>
            <table>
                <tr>
                    {[1,2,3].map((i)=><td onClick={()=> changeNum(i)}>{i}</td>)}
                </tr>
                <tr>
                    {[4,5,6].map((i)=><td onClick={()=> changeNum(i)}>{i}</td>)}
                </tr>
                <tr>
                    {[7,8,9].map((i)=><td onClick={()=> changeNum(i)}>{i}</td>)}
                </tr>
                <tr>
                    {["+","-"].map((i)=><td onClick={()=> changeNum(i)}>{i}</td>)}
                    <td onClick={calculate}>=</td>
                </tr>
                <tr>
                    <td onClick={eraseNum}>C</td>
                </tr>
            </table>
        </div>
    );
}
export default Table;
