public class GameMaster {
    public static void main(String[] args){

        Hero abel = new Hero();
        abel.name = "アベル";
        abel.hp = 100;
        abel.weapon = "銅の剣";

        Slime slimeA = new Slime();
        slimeA.name = "スライムA";
        slimeA.hp = 30;

        System.out.println("冒険が始まる…！");

        abel.showStatus();
        slimeA.showStatus();

        System.out.println("戦闘開始！");

        abel.attack(slimeA);
        slimeA.showStatus();
        slimeA.attack(abel);
        slimeA.showStatus();
        abel.heal();
        abel.showStatus();
        for(int i = 0; i < 3; i++){
            abel.attack(slimeA);
        }

        System.out.println("--- 戦闘終了 ---");

        System.out.println("最終ステータス：");
        abel.showStatus();
        slimeA.showStatus();
        System.out.println(abel.isAlive());
        System.out.println(slimeA.isAlive());

        System.out.println("--- 参照の確認 ---");
        Character partyMember = abel;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        abel.showStatus();
    }
}
