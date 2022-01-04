class Livres extends React.Component {
    constructor() {
        super();
        this.state = {
          showPopup: false
        };
    }
    togglePopup() {
    this.setState({
        showPopup: !this.state.showPopup
    });
    }
    render() {
        return (
        <div className="board-row">
            <div className="square">{this.props.empId}</div>
            <div className="square">{this.props.title}</div>
            <div className="square">{this.props.auteur}</div>
            {/* <div className="square-voir">Voir</div>*/} 
            <button className="button-voir" onClick={this.togglePopup.bind(this)}>Voir</button>
            <button className="button-edit" onClick={this.togglePopup.bind(this)}>Edit</button>
            {this.state.showPopup ? 
                <Popup
                    text='Close Me'
                    title={this.props.title}
                    auteur={this.props.auteur}
                    closePopup={this.togglePopup.bind(this)}
                />
                : null
            }
        </div>
        );
    }
}

class Popup extends React.Component {
    render() {
      return (
        <div className='popup'>
          <div className='popup_inner'>
            <h1>Titre : {this.props.title}</h1>
            <p>Auteur : {this.props.auteur}</p>
          <button onClick={this.props.closePopup}>FERMER</button>
          </div>
        </div>
      );
    }
}

class LivresList extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        livres: [
          { empId: 1, title: "Trump...", auteur: "Jean" },
          { empId: 2, title: "Ivanka...", auteur: "Pauleta" },
          { empId: 3, title: "Kushner...", auteur: "Christian" }
        ]
      };
    }


    render() {
        // Array of <Livres>
        var listItems = this.state.livres.map(e => (
          <Livres empId={e.empId} title={e.title} auteur={e.auteur} />
        ));
        return (
            <div>
                <h1>Liste des livres</h1>
                <p>Voici les livres disponibles</p>
                <div className="board-row">
                    <div className="square-titre">ID</div>
                    <div className="square-titre">TITRE</div>
                    <div className="square-titre">AUTEUR</div>
                </div>
                {listItems}
                
            </div>
          );
      }
    }

ReactDOM.render(
    <LivresList />,
    document.getElementById('root')
);