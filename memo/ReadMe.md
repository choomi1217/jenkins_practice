# 젠킨슨 설정

1. git에 project push
2. project action 설정
![깃허브에 액션 페이지1](./image/jenkins-action1.png) 
![깃허브에 액션 페이지2](./image/jenkins-action2.png)
3. 아래처럼 yml 파일이 생김
![깃허브 야믈 파일](./image/git-jenkins-yaml.png)
4. 아래처럼 Action에 workflow가 생김
![깃허브 야믈 파일](./image/git-workflow.png)
5. 로컬에서 추가한 yml 파일 pull로 땡겨옴
![pull](./image/git-pull.png)
6. https://github.com/actions/checkout/tree/main/.github/workflows  에 가서  