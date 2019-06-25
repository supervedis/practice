const github = new GitHub();
const ui = new UI();

const searchUser = document.getElementById('searchUser');

searchUser.addEventListener('keyup', (e) =>{
    const input = e.target.value;

    if(input !== ''){
        github.getUser(input).then( data => {
            if(data.user_response.message === `Not Found`){
                //Show alert
                ui.showAlert('User not found','alert alert-danger');
            }else{
                //Show profile
                ui.showProfile(data.user_response);
                ui.showRepos(data.repos_response);
            }
        });
    }else{
        //Clear profile
        ui.clearProfile();
    }
});