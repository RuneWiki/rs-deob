package deob;

@ObfuscatedName("jn")
public class class285 implements Comparable {

    @ObfuscatedName("jn.d")
    public class294 field3625;

    @ObfuscatedName("jn.c")
    public class294 field3626;

    @ObfuscatedName("jn.ag(B)Lkk;")
    public class294 method4851() {
        return this.field3625;
    }

    @ObfuscatedName("jn.ae(I)Ljava/lang/String;")
    public String method4841() {
        return this.field3625 == null ? "" : this.field3625.method4963();
    }

    @ObfuscatedName("jn.ac(B)Ljava/lang/String;")
    public String method4847() {
        return this.field3626 == null ? "" : this.field3626.method4963();
    }

    @ObfuscatedName("jn.aq(Lkk;Lkk;B)V")
    public void method4843(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3625 = arg0;
        this.field3626 = arg1;
    }

    @ObfuscatedName("jn.at(Ljn;I)I")
    public int method4844(class285 arg0) {
        return this.field3625.method4967(arg0.field3625);
    }

    public int compareTo(Object arg0) {
        return this.method4844((class285) arg0);
    }
}
