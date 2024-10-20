package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ad")
public class class36 {

    @ObfuscatedName("ad.m")
    public int field246 = -1;

    @ObfuscatedName("ad.o")
    public String field242;

    @ObfuscatedName("ad.q")
    public String field243;

    @ObfuscatedName("ad.j")
    public int field244 = -1;

    @ObfuscatedName("ad.p")
    public int field245 = -1;

    @ObfuscatedName("ad.g")
    public class223 field252 = null;

    @ObfuscatedName("ad.n")
    public int field247 = Integer.MAX_VALUE;

    @ObfuscatedName("ad.u")
    public int field248 = 0;

    @ObfuscatedName("ad.a")
    public int field249 = Integer.MAX_VALUE;

    @ObfuscatedName("ad.z")
    public int field241 = 0;

    @ObfuscatedName("ad.w")
    public boolean field251 = false;

    @ObfuscatedName("ad.y")
    public LinkedList field253;

    @ObfuscatedName("ad.m(Lkn;II)V")
    public void method327(class310 arg0, int arg1) {
        this.field246 = arg1;
        this.field242 = arg0.method5236();
        this.field243 = arg0.method5236();
        this.field252 = new class223(arg0.method5209());
        this.field244 = arg0.method5209();
        arg0.method5227();
        this.field251 = arg0.method5227() == 1;
        this.field245 = arg0.method5227();
        int var3 = arg0.method5227();
        this.field253 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field253.add(this.method328(arg0));
        }
        this.method333();
    }

    @ObfuscatedName("ad.o(Lkn;B)Law;")
    public class47 method328(class310 arg0) {
        int var2 = arg0.method5227();
        class30[] var3 = new class30[] { class30.field172, class30.field174, class30.field165, class30.field167 };
        class30 var4 = (class30) class205.method3095(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field168) {
            case 0:
                var6 = new class43();
                break;
            case 1:
                var6 = new class52();
                break;
            case 2:
                var6 = new class29();
                break;
            case 3:
                var6 = new class34();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class47) var6).method249(arg0);
        return (class47) var6;
    }

    @ObfuscatedName("ad.q(IIII)Z")
    public boolean method342(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field253.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class47) var4.next();
        } while (!var5.method245(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ad.j(IIB)Z")
    public boolean method330(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field247 || var3 > this.field248) {
            return false;
        } else if (var4 >= this.field249 && var4 <= this.field241) {
            Iterator var5 = this.field253.iterator();
            class47 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class47) var5.next();
            } while (!var6.method246(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.p(IIII)[I")
    public int[] method355(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field253.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class47) var4.next();
        } while (!var5.method245(arg0, arg1, arg2));
        return var5.method247(arg0, arg1, arg2);
    }

    @ObfuscatedName("ad.g(III)Lhg;")
    public class223 method386(int arg0, int arg1) {
        Iterator var3 = this.field253.iterator();
        class47 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class47) var3.next();
        } while (!var4.method246(arg0, arg1));
        return var4.method248(arg0, arg1);
    }

    @ObfuscatedName("ad.n(B)V")
    public void method333() {
        Iterator var1 = this.field253.iterator();
        while (var1.hasNext()) {
            class47 var2 = (class47) var1.next();
            var2.method244(this);
        }
    }

    @ObfuscatedName("ad.u(I)I")
    public int method334() {
        return this.field246;
    }

    @ObfuscatedName("ad.a(I)Z")
    public boolean method385() {
        return this.field251;
    }

    @ObfuscatedName("ad.z(I)Ljava/lang/String;")
    public String method336() {
        return this.field242;
    }

    @ObfuscatedName("ad.w(I)Ljava/lang/String;")
    public String method337() {
        return this.field243;
    }

    @ObfuscatedName("ad.y(B)I")
    public int method338() {
        return this.field244;
    }

    @ObfuscatedName("ad.c(B)I")
    public int method339() {
        return this.field245;
    }

    @ObfuscatedName("ad.h(I)I")
    public int method340() {
        return this.field247;
    }

    @ObfuscatedName("ad.k(B)I")
    public int method376() {
        return this.field248;
    }

    @ObfuscatedName("ad.r(I)I")
    public int method357() {
        return this.field249;
    }

    @ObfuscatedName("ad.d(I)I")
    public int method343() {
        return this.field241;
    }

    @ObfuscatedName("ad.e(I)I")
    public int method344() {
        return this.field252.field2566;
    }

    @ObfuscatedName("ad.l(I)I")
    public int method345() {
        return this.field252.field2567;
    }

    @ObfuscatedName("ad.t(I)I")
    public int method346() {
        return this.field252.field2565;
    }

    @ObfuscatedName("ad.x(I)Lhg;")
    public class223 method347() {
        return new class223(this.field252);
    }
}
