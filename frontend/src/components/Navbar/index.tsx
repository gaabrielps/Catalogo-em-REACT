import {ReactComponent as GithubIcon} from 'Assets/img/github.svg'
import './style.css'

function Navbar (){
    return(
        <header>
    <nav className="container">
        <div className="dsmovie-nav-content">
            <h1>PaulisMovie</h1>
            <a href="https://github.com/gaabrielps" target="_blank" rel="noreferrer">
                <div className="dsmovie-contact-container">
                    <GithubIcon />
                    <p className="dsmovie-contact-link">/Gabrielps</p>
                </div>
            </a>
        </div>
    </nav>
</header>
    )
}

export default Navbar;