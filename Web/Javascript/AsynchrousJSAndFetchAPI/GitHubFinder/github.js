class GitHub {
    constructor(){
        this.client_id = "acd743b30749a17b3e50";
        this.client_secret = "013f71b873b73313a53c748b5fe71c7251217403";
        this.repos_count = 5;
        this.repos_sort = `created: asc`;
    }

    async getUser(user){
        const user_request = await fetch(
            `https://api.github.com/users/${user}?client_id=${this.client_id}
            &client_secret=${this.client_secret}`);

        const repo_request = await fetch(
            `https://api.github.com/users/${user}/repos?per_page=${this.repos_count}
            &sort=${this.repos_sort}&client_id=${this.client_id}
            &client_secret=${this.client_secret}`);

        const user_response = await user_request.json();
        const repos_response = await repo_request.json();

        return {
            user_response,
            repos_response
        }
    }
}