const Navbar = () => {

    return(
        
        <div className="Navbar">
            <a href="/table">
                <div className="navButton">계산기</div> 
            </a>

            <a href="/calendar">
                <div className="otherDiv navButton">달력</div>
            </a>
            <div className="otherDiv navButton">로그인</div>
            <div className="otherDiv navButton">자기소개</div> 
        </div>
    );
}
export default Navbar;