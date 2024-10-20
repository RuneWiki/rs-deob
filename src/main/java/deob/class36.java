package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ak")
public class class36 {

    @ObfuscatedName("ak.f")
    public int field247 = -1;

    @ObfuscatedName("ak.b")
    public String field253;

    @ObfuscatedName("ak.l")
    public String field249;

    @ObfuscatedName("ak.m")
    public int field241 = -1;

    @ObfuscatedName("ak.z")
    public int field242 = -1;

    @ObfuscatedName("ak.q")
    public class223 field243 = null;

    @ObfuscatedName("ak.k")
    public int field244 = Integer.MAX_VALUE;

    @ObfuscatedName("ak.c")
    public int field238 = 0;

    @ObfuscatedName("ak.u")
    public int field239 = Integer.MAX_VALUE;

    @ObfuscatedName("ak.t")
    public int field240 = 0;

    @ObfuscatedName("ak.e")
    public boolean field248 = false;

    @ObfuscatedName("ak.o")
    public LinkedList field245;

    @ObfuscatedName("ak.f(Lkb;II)V")
    public void method355(class311 arg0, int arg1) {
        this.field247 = arg1;
        this.field253 = arg0.method5189();
        this.field249 = arg0.method5189();
        this.field243 = new class223(arg0.method5330());
        this.field241 = arg0.method5330();
        arg0.method5276();
        this.field248 = arg0.method5276() == 1;
        this.field242 = arg0.method5276();
        int var3 = arg0.method5276();
        this.field245 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field245.add(this.method356(arg0));
        }
        this.method361();
    }

    @ObfuscatedName("ak.b(Lkb;I)Las;")
    public class47 method356(class311 arg0) {
        int var2 = arg0.method5276();
        class30[] var3 = new class30[] { class30.field186, class30.field183, class30.field182, class30.field181 };
        class30 var4 = (class30) class205.method3432(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field180) {
            case 0:
                var6 = new class52();
                break;
            case 1:
                var6 = new class29();
                break;
            case 2:
                var6 = new class34();
                break;
            case 3:
                var6 = new class43();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class47) var6).method288(arg0);
        return (class47) var6;
    }

    @ObfuscatedName("ak.l(IIII)Z")
    public boolean method357(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field245.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class47) var4.next();
        } while (!var5.method269(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ak.m(IIB)Z")
    public boolean method431(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field244 || var3 > this.field238) {
            return false;
        } else if (var4 >= this.field239 && var4 <= this.field240) {
            Iterator var5 = this.field245.iterator();
            class47 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class47) var5.next();
            } while (!var6.method284(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.z(IIII)[I")
    public int[] method359(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field245.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class47) var4.next();
        } while (!var5.method269(arg0, arg1, arg2));
        return var5.method282(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.q(III)Lhw;")
    public class223 method360(int arg0, int arg1) {
        Iterator var3 = this.field245.iterator();
        class47 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class47) var3.next();
        } while (!var4.method284(arg0, arg1));
        return var4.method271(arg0, arg1);
    }

    @ObfuscatedName("ak.k(B)V")
    public void method361() {
        Iterator var1 = this.field245.iterator();
        while (var1.hasNext()) {
            class47 var2 = (class47) var1.next();
            var2.method268(this);
        }
    }

    @ObfuscatedName("ak.c(B)I")
    public int method362() {
        return this.field247;
    }

    @ObfuscatedName("ak.u(I)Z")
    public boolean method363() {
        return this.field248;
    }

    @ObfuscatedName("ak.t(B)Ljava/lang/String;")
    public String method364() {
        return this.field253;
    }

    @ObfuscatedName("ak.e(I)Ljava/lang/String;")
    public String method365() {
        return this.field249;
    }

    @ObfuscatedName("ak.o(I)I")
    public int method391() {
        return this.field241;
    }

    @ObfuscatedName("ak.n(B)I")
    public int method367() {
        return this.field242;
    }

    @ObfuscatedName("ak.x(I)I")
    public int method368() {
        return this.field244;
    }

    @ObfuscatedName("ak.p(I)I")
    public int method416() {
        return this.field238;
    }

    @ObfuscatedName("ak.r(I)I")
    public int method370() {
        return this.field239;
    }

    @ObfuscatedName("ak.y(I)I")
    public int method371() {
        return this.field240;
    }

    @ObfuscatedName("ak.s(B)I")
    public int method372() {
        return this.field243.field2557;
    }

    @ObfuscatedName("ak.j(I)I")
    public int method373() {
        return this.field243.field2555;
    }

    @ObfuscatedName("ak.d(I)I")
    public int method404() {
        return this.field243.field2554;
    }

    @ObfuscatedName("ak.a(I)Lhw;")
    public class223 method374() {
        return new class223(this.field243);
    }
}
