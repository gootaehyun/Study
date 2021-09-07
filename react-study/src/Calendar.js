import { useState } from "react";

const Calendar = () => {
    /* State를 Date객체인 date(날짜)로 통일
     다른 모든 함수는 date를 이용해 getMonth, getYear하는 방식으로 변경 예정
    */
    const [date, setDate] = useState(new Date());

    console.log(date)
    //date:오늘 날짜(선택된 날짜)
    const today = date.getDate();

    const yoyils = ["SUN","MON","TUE","WEN","THU","FRI","SAT"];
    const mDays = [31,28,31,30,31,30,31,31,30,31,30,31];
    var thisFirst = new Date(date.getFullYear(),date.getMonth(),1)
    //이번달 1일
    var ibundalililsyoyil = thisFirst.getDay();
    //이번달 1일의 요일 (일요일 = 0, 월요일 = 1 ...)
    const thisMonth = date.getMonth();
    const thisYear = date.getFullYear();

    //-------- 커서관련 함수 --------------------
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
    // -------------------------------------

    function isLeapYear(year) {
        return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
    }
    if(isLeapYear(thisYear)){
        mDays[1]=29
    }

    const days = []; // 1부터 31이 들어간 리스트를 만들거임
    for(var i=1 ;i<=mDays[thisMonth];i++){
        days.push(i)
    }
    function clickDate(i){
        setDate(new Date(date.getFullYear(),date.getMonth(),i))
    }

    function postMonth(){
        setDate(new Date(date.getFullYear(),date.getMonth()-1,1))
    }
    function nextMonth(){
        setDate(new Date(date.getFullYear(),date.getMonth()+1,1))
    }

    return ( 
        <div className="Calendar-container" onClick={handleClick}>
            <div className="cal-month"> {thisMonth+1}월 </div>
            <button onClick={postMonth}>이전달</button>
            <button onClick={nextMonth}>다음달</button>
            <div className="cal-con">
            {
                yoyils.map((yoyil)=>
                <div className="cal-cell" key={yoyil}> {yoyil} </div>
                )
            }
            {
                //빈칸넣기
                Array(ibundalililsyoyil).fill(null).map((e,i)=>
                <div className="cal-cell" key={i}> {"\b"} </div>
                )
            }
            {
                days.map((i)=>
                <div className= {i===today?"cal-cell today":"cal-cell"}
                onClick={()=>clickDate(i)} key={i}>{i}</div>) 
            }
            </div>
            <div className="Dday"
            style={style}></div>
        </div>
        
    );
}
export default Calendar;
