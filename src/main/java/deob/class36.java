package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("as")
public class class36 {

    @ObfuscatedName("as.x")
    public int field261 = -1;

    @ObfuscatedName("as.m")
    public String field258;

    @ObfuscatedName("as.k")
    public String field255;

    @ObfuscatedName("as.d")
    public int field256 = -1;

    @ObfuscatedName("as.w")
    public int field257 = -1;

    @ObfuscatedName("as.v")
    public class223 field264 = null;

    @ObfuscatedName("as.q")
    public int field259 = Integer.MAX_VALUE;

    @ObfuscatedName("as.z")
    public int field260 = 0;

    @ObfuscatedName("as.t")
    public int field262 = Integer.MAX_VALUE;

    @ObfuscatedName("as.e")
    public int field254 = 0;

    @ObfuscatedName("as.s")
    public boolean field263 = false;

    @ObfuscatedName("as.p")
    public LinkedList field267;

    @ObfuscatedName("as.x(Lkb;IB)V")
    public void method399(class310 arg0, int arg1) {
        this.field261 = arg1;
        this.field258 = arg0.method5257();
        this.field255 = arg0.method5257();
        this.field264 = new class223(arg0.method5142());
        this.field256 = arg0.method5142();
        arg0.method5137();
        this.field263 = arg0.method5137() == 1;
        this.field257 = arg0.method5137();
        int var3 = arg0.method5137();
        this.field267 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field267.add(this.method383(arg0));
        }
        this.method374();
    }

    @ObfuscatedName("as.m(Lkb;I)Lay;")
    public class47 method383(class310 arg0) {
        int var2 = arg0.method5137();
        class30 var3 = (class30) class205.method129(class30.method311(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field193) {
            case 0:
                var5 = new class29();
                break;
            case 1:
                var5 = new class52();
                break;
            case 2:
                var5 = new class43();
                break;
            case 3:
                var5 = new class34();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class47) var5).method284(arg0);
        return (class47) var5;
    }

    @ObfuscatedName("as.k(IIIB)Z")
    public boolean method396(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field267.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class47) var4.next();
        } while (!var5.method280(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("as.d(III)Z")
    public boolean method371(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field259 || var3 > this.field260) {
            return false;
        } else if (var4 >= this.field262 && var4 <= this.field254) {
            Iterator var5 = this.field267.iterator();
            class47 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class47) var5.next();
            } while (!var6.method281(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.w(IIIB)[I")
    public int[] method372(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field267.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class47) var4.next();
        } while (!var5.method280(arg0, arg1, arg2));
        return var5.method282(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.v(IIB)Lhj;")
    public class223 method384(int arg0, int arg1) {
        Iterator var3 = this.field267.iterator();
        class47 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class47) var3.next();
        } while (!var4.method281(arg0, arg1));
        return var4.method283(arg0, arg1);
    }

    @ObfuscatedName("as.q(I)V")
    public void method374() {
        Iterator var1 = this.field267.iterator();
        while (var1.hasNext()) {
            class47 var2 = (class47) var1.next();
            var2.method293(this);
        }
    }

    @ObfuscatedName("as.z(B)I")
    public int method369() {
        return this.field261;
    }

    @ObfuscatedName("as.t(B)Z")
    public boolean method386() {
        return this.field263;
    }

    @ObfuscatedName("as.e(B)Ljava/lang/String;")
    public String method377() {
        return this.field258;
    }

    @ObfuscatedName("as.s(I)Ljava/lang/String;")
    public String method378() {
        return this.field255;
    }

    @ObfuscatedName("as.p(B)I")
    public int method379() {
        return this.field256;
    }

    @ObfuscatedName("as.n(I)I")
    public int method380() {
        return this.field257;
    }

    @ObfuscatedName("as.u(I)I")
    public int method381() {
        return this.field259;
    }

    @ObfuscatedName("as.h(I)I")
    public int method382() {
        return this.field260;
    }

    @ObfuscatedName("as.g(I)I")
    public int method367() {
        return this.field262;
    }

    @ObfuscatedName("as.i(I)I")
    public int method370() {
        return this.field254;
    }

    @ObfuscatedName("as.a(I)I")
    public int method385() {
        return this.field264.field2533;
    }

    @ObfuscatedName("as.o(I)I")
    public int method424() {
        return this.field264.field2529;
    }

    @ObfuscatedName("as.c(B)I")
    public int method375() {
        return this.field264.field2530;
    }

    @ObfuscatedName("as.f(I)Lhj;")
    public class223 method388() {
        return new class223(this.field264);
    }
}
