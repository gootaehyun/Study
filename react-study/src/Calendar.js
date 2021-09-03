import { useState } from "react";

const Calendar = () => {
    const [date, setDate] = useState(new Date());
    console.log(date)
    //date:오늘 날짜(선택된 날짜)
    const [today,setToday] = useState(date.getDate());
    // 지난번에 달력 다음달 기능 넣는거 기억나는사람??
    //윤달...
    const yoyils = ["SUN","MON","TUE","WEN","THU","FRI","SAT"];
    var mDays = [31,28,31,30,31,30,31,31,30,31,30,31]

    var thisFirst = new Date(date.getFullYear(),date.getMonth(),1)
    //이번달 1일
    var ibundalililsyoyil = thisFirst.getDay();
    //이번달 1일의 요일 (일요일 = 0, 월요일 = 1 ...)
    const thisMonth = date.getMonth();
    const thisYear = date.getFullYear();
    //커서위치 스테이트
    const [cursorX,setCursorX] =useState(0);
    const [cursorY,setCursorY] =useState(0);
    
    // 클릭핸들링
    const handleClick = e =>{
        setCursorX(e.pageX)
        setCursorY(e.pageY)
    }
    const style = {
        left : cursorX-50,
        top : cursorY-50
        
    }
    function isLeapYear(year) {
        return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
    }
    if(isLeapYear(thisYear)){
        mDays[1]=29
    }

    var days = []; // 1부터 31이 들어간 리스트를 만들거임
    for(var i=1 ;i<=mDays[thisMonth];i++){
        days.push(i)
    }
    function clickDate(i){
        //console.log(i - today)
        //클릭한 날짜 - Today log찍으면 됩니다..
        //여기에 d-n을 console.log 찍을게..
    }

    return ( 
        <div className="Calendar-container" onClick={handleClick}>
            <div className="cal-month"> {thisMonth+1}월 </div>
            <div className="cal-con">
            {
                yoyils.map((yoyil)=>
                <div className="cal-cell"> {yoyil} </div>
                )
            }
            {
                //빈칸넣기
                Array(ibundalililsyoyil).fill(null).map((i)=>
                <div className="cal-cell"> {"\b"} </div>
                )
            }
            {
                days.map((i)=>
                <div className= {i===today?"cal-cell today":"cal-cell"}
                onClick={()=>clickDate(i)}>{i}</div>) 
            }
            </div>
            <div className="Dday"
            style={style}></div>
        </div>
        
    );
}
export default Calendar;
