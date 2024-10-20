package deob;

@ObfuscatedName("cg")
public final class class74 extends class256 {

    @ObfuscatedName("cg.ak")
    public int field914;

    @ObfuscatedName("cg.al")
    public int field904;

    @ObfuscatedName("cg.aj")
    public int field905;

    @ObfuscatedName("cg.az")
    public int field906;

    @ObfuscatedName("cg.af")
    public int field910;

    @ObfuscatedName("cg.aa")
    public int field908;

    @ObfuscatedName("cg.at")
    public class227 field909;

    @ObfuscatedName("cg.ab")
    public int field907 = 0;

    @ObfuscatedName("cg.ac")
    public int field911 = 0;

    @ObfuscatedName("cg.ao")
    public boolean field912 = false;

    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field914 = arg0;
        this.field905 = arg1;
        this.field906 = arg2;
        this.field910 = arg3;
        this.field908 = arg4;
        this.field904 = arg5 + arg6;
        int var8 = class215.method3870(this.field914).field2196;
        if (var8 == -1) {
            this.field912 = true;
        } else {
            this.field912 = false;
            this.field909 = class227.method4744(var8);
        }
    }

    @ObfuscatedName("cg.ak(IB)V")
    public final void method2006(int arg0) {
        if (this.field912) {
            return;
        }
        this.field911 += arg0;
        if (this.field909.method4051()) {
            this.field907 += arg0;
            if (this.field907 >= this.field909.method4018()) {
                this.field912 = true;
            }
            return;
        }
        while (this.field911 > this.field909.field2421[this.field907]) {
            this.field911 -= this.field909.field2421[this.field907];
            this.field907++;
            if (this.field907 >= this.field909.field2424.length) {
                this.field912 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cg.ah(I)Lkb;")
    public final class264 method2007() {
        class215 var1 = class215.method3870(this.field914);
        class264 var2;
        if (this.field912) {
            var2 = var1.method3727(-1);
        } else {
            var2 = var1.method3727(this.field907);
        }
        return var2 == null ? null : var2;
    }
}
