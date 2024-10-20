package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ar")
public class class36 {

    @ObfuscatedName("ar.z")
    public int field244 = -1;

    @ObfuscatedName("ar.k")
    public String field237;

    @ObfuscatedName("ar.s")
    public String field238;

    @ObfuscatedName("ar.t")
    public int field239 = -1;

    @ObfuscatedName("ar.i")
    public int field240 = -1;

    @ObfuscatedName("ar.o")
    public class223 field248 = null;

    @ObfuscatedName("ar.x")
    public int field242 = Integer.MAX_VALUE;

    @ObfuscatedName("ar.w")
    public int field243 = 0;

    @ObfuscatedName("ar.g")
    public int field247 = Integer.MAX_VALUE;

    @ObfuscatedName("ar.m")
    public int field241 = 0;

    @ObfuscatedName("ar.n")
    public boolean field245 = false;

    @ObfuscatedName("ar.d")
    public LinkedList field246;

    @ObfuscatedName("ar.z(Lkf;IB)V")
    public void method339(class310 arg0, int arg1) {
        this.field244 = arg1;
        this.field237 = arg0.method5202();
        this.field238 = arg0.method5202();
        this.field248 = new class223(arg0.method5270());
        this.field239 = arg0.method5270();
        arg0.method5193();
        this.field245 = arg0.method5193() == 1;
        this.field240 = arg0.method5193();
        int var3 = arg0.method5193();
        this.field246 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field246.add(this.method335(arg0));
        }
        this.method348();
    }

    @ObfuscatedName("ar.k(Lkf;B)Lay;")
    public class47 method335(class310 arg0) {
        int var2 = arg0.method5193();
        class30 var3 = (class30) class205.method2633(class30.method287(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field178) {
            case 0:
                var5 = new class52();
                break;
            case 1:
                var5 = new class43();
                break;
            case 2:
                var5 = new class34();
                break;
            case 3:
                var5 = new class29();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class47) var5).method269(arg0);
        return (class47) var5;
    }

    @ObfuscatedName("ar.s(IIIB)Z")
    public boolean method336(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field246.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class47) var4.next();
        } while (!var5.method280(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ar.t(IIB)Z")
    public boolean method337(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field242 || var3 > this.field243) {
            return false;
        } else if (var4 >= this.field247 && var4 <= this.field241) {
            Iterator var5 = this.field246.iterator();
            class47 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class47) var5.next();
            } while (!var6.method279(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.i(IIII)[I")
    public int[] method338(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field246.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class47) var4.next();
        } while (!var5.method280(arg0, arg1, arg2));
        return var5.method267(arg0, arg1, arg2);
    }

    @ObfuscatedName("ar.o(III)Lhg;")
    public class223 method378(int arg0, int arg1) {
        Iterator var3 = this.field246.iterator();
        class47 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class47) var3.next();
        } while (!var4.method279(arg0, arg1));
        return var4.method284(arg0, arg1);
    }

    @ObfuscatedName("ar.x(I)V")
    public void method348() {
        Iterator var1 = this.field246.iterator();
        while (var1.hasNext()) {
            class47 var2 = (class47) var1.next();
            var2.method265(this);
        }
    }

    @ObfuscatedName("ar.w(I)I")
    public int method333() {
        return this.field244;
    }

    @ObfuscatedName("ar.g(I)Z")
    public boolean method377() {
        return this.field245;
    }

    @ObfuscatedName("ar.m(I)Ljava/lang/String;")
    public String method343() {
        return this.field237;
    }

    @ObfuscatedName("ar.n(S)Ljava/lang/String;")
    public String method346() {
        return this.field238;
    }

    @ObfuscatedName("ar.d(I)I")
    public int method351() {
        return this.field239;
    }

    @ObfuscatedName("ar.h(B)I")
    public int method389() {
        return this.field240;
    }

    @ObfuscatedName("ar.a(B)I")
    public int method380() {
        return this.field242;
    }

    @ObfuscatedName("ar.q(I)I")
    public int method340() {
        return this.field243;
    }

    @ObfuscatedName("ar.c(I)I")
    public int method349() {
        return this.field247;
    }

    @ObfuscatedName("ar.j(I)I")
    public int method350() {
        return this.field241;
    }

    @ObfuscatedName("ar.r(I)I")
    public int method406() {
        return this.field248.field2563;
    }

    @ObfuscatedName("ar.u(B)I")
    public int method352() {
        return this.field248.field2568;
    }

    @ObfuscatedName("ar.p(I)I")
    public int method410() {
        return this.field248.field2565;
    }

    @ObfuscatedName("ar.b(B)Lhg;")
    public class223 method354() {
        return new class223(this.field248);
    }
}
