public class Planet {
    /**
     * Planet的属性值，全局变量
     */
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    /**
     * 使用每个参数来形成构造函数
     */
    public Planet(double xP, double yP, double xV, double yV, double m, String img) {

        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    /**
     * 复制构造函数
     */
    public Planet(Planet p) {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    /**
     * 使用方法calcDistance计算两个星球之间的距离
     * 这是实例方法所以只要另外一个星球（只需要一个参数）
     */
    public double calcDistance(Planet p) {
        double distanceX = this.xxPos - p.xxPos;
        double distanceY = this.yyPos - p.yyPos;
        double distance = distanceX * distanceX + distanceY * distanceY;
        double d = Math.sqrt(distance);
        return d;
    }

    public double calcForceExertedBy(Planet p) {
        double ForceExertedBy = this.mass * p.mass * 6.67e-11 / (this.calcDistance(p) * this.calcDistance(p));
        return ForceExertedBy;
    }

    public double calcForceExertedByX(Planet p) {
        double coss = Math.sqrt((this.xxPos - p.xxPos) * (this.xxPos - p.xxPos)) / this.calcDistance(p);
        double Xforce = coss * this.calcForceExertedBy(p);
        return Xforce;
    }

    public double calcForceExertedByY(Planet p) {
        double sinn = Math.sqrt((this.yyPos - p.yyPos) * (this.yyPos - p.yyPos)) / this.calcDistance(p);
        double Yforce = sinn * this.calcForceExertedBy(p);
        return Yforce;
    }

    public double calcNetForceExertedByX(Planet[] p) {
        double calcNetForceExertedByX = 0;
        for (int i = 0; i <= p.length - 1; i++) {
            if (p[i] != this) {
                calcNetForceExertedByX = this.calcForceExertedByX(p[i]) + calcNetForceExertedByX;
            }
        }
        return calcNetForceExertedByX;
    }

    public double calcNetForceExertedByY(Planet[] p) {
        double calcNetForceExertedByY = 0;
        for (int i = 0; i <= p.length - 1; i++) {
            if (p[i] != this) {
                calcNetForceExertedByY = this.calcForceExertedByY(p[i]) + calcNetForceExertedByY;
            }
        }
        return calcNetForceExertedByY;
    }

    public void update(double t,double xf,double yf){
        double Xac = xf / this.mass;
        double Yac = yf/ this.mass;
        xxVel = this.xxVel + t * Xac;
        yyVel = this.yyVel + t * Yac;
        xxPos= this.xxVel * t+xxPos;
        yyPos= this.yyVel * t+yyPos;
        
    }
}
    