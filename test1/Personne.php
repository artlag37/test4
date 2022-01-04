<?php 

class Personne{
    private int $id;
    private ?string $nom;
    private ?string $prenom;
    private DateTime $datenaiss;
    private string $telephone;
    private string $email;
    private string $login;
    private string $pwd;

    

    public function __construct(string $n,string $p, DateTime $d, $t, $e, $l, $pw){
        $this->nom=$n;
        $this->prenom=$p;
        $this->datenaiss=$d;
        $this->telephone=$t;
        $this->email=$e;
        $this->login=$l;
        $this->pw=$pw;
    }
    

    /**
     * Get the value of id
     */ 
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set the value of id
     *
     * @return  self
     */ 
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Get the value of nom
     */ 
    public function getNom()
    {
        return $this->nom;
    }

    /**
     * Set the value of nom
     *
     * @return  self
     */ 
    public function setNom($nom)
    {
        $this->nom = $nom;

        return $this;
    }

    /**
     * Get the value of prenom
     */ 
    public function getPrenom()
    {
        return $this->prenom;
    }

    /**
     * Set the value of prenom
     *
     * @return  self
     */ 
    public function setPrenom($prenom)
    {
        $this->prenom = (md5($prenom));

        return $this;
    }

    /**
     * Get the value of datenaiss
     */ 
    public function getDatenaiss()
    {
        return $this->datenaiss;
    }

    /**
     * Set the value of datenaiss
     *
     * @return  self
     */ 
    public function setDatenaiss($datenaiss)
    {
        $this->datenaiss = $datenaiss;

        return $this;
    }

    /**
     * Get the value of telephone
     */ 
    public function getTelephone()
    {
        return $this->telephone;
    }

    /**
     * Set the value of telephone
     *
     * @return  self
     */ 
    public function setTelephone($telephone)
    {
        $this->telephone = $telephone;

        return $this;
    }

    /**
     * Get the value of email
     */ 
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * Set the value of email
     *
     * @return  self
     */ 
    public function setEmail($email)
    {
        $this->email = $email;

        return $this;
    }

    /**
     * Get the value of login
     */ 
    public function getLogin()
    {
        return $this->login;
    }

    /**
     * Set the value of login
     *
     * @return  self
     */ 
    public function setLogin($login)
    {
        $this->login = $login;

        return $this;
    }

    /**
     * Get the value of pwd
     */ 
    public function getPwd()
    {
        return $this->pwd;
    }

    /**
     * Set the value of pwd
     *
     * @return  self
     */ 
    public function setPwd($pwd)
    {
        $this->pwd = $pwd;

        return $this;
    }

    public function __toString(){
        return '[' .$this->getNom().','
        .$this->getPrenom().','
        .$this->getDatenaiss()->format('Y-m-d').','
        .$this->getTelephone().','
        .$this->getEmail().','
        .$this->getLogin().','
        .$this->getPwd().']';
    }

}

