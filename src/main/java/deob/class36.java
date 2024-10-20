package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ar")
public class class36 {

    @ObfuscatedName("ar.n")
    public int field255 = -1;

    @ObfuscatedName("ar.v")
    public String field241;

    @ObfuscatedName("ar.d")
    public String field243;

    @ObfuscatedName("ar.c")
    public int field253 = -1;

    @ObfuscatedName("ar.y")
    public int field245 = -1;

    @ObfuscatedName("ar.h")
    public class223 field242 = null;

    @ObfuscatedName("ar.z")
    public int field246 = Integer.MAX_VALUE;

    @ObfuscatedName("ar.e")
    public int field247 = 0;

    @ObfuscatedName("ar.q")
    public int field248 = Integer.MAX_VALUE;

    @ObfuscatedName("ar.l")
    public int field251 = 0;

    @ObfuscatedName("ar.s")
    public boolean field250 = false;

    @ObfuscatedName("ar.b")
    public LinkedList field240;

    @ObfuscatedName("ar.n(Lkx;II)V")
    public void method346(class311 arg0, int arg1) {
        this.field255 = arg1;
        this.field241 = arg0.method5465();
        this.field243 = arg0.method5465();
        this.field242 = new class223(arg0.method5455());
        this.field253 = arg0.method5455();
        arg0.method5310();
        this.field250 = arg0.method5310() == 1;
        this.field245 = arg0.method5310();
        int var3 = arg0.method5310();
        this.field240 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field240.add(this.method347(arg0));
        }
        this.method361();
    }

    @ObfuscatedName("ar.v(Lkx;I)Lab;")
    public class47 method347(class311 arg0) {
        int var2 = arg0.method5310();
        class30[] var3 = new class30[] { class30.field185, class30.field188, class30.field190, class30.field186 };
        class30 var4 = (class30) class205.method1123(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field189) {
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
        ((class47) var6).method270(arg0);
        return (class47) var6;
    }

    @ObfuscatedName("ar.d(IIII)Z")
    public boolean method348(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field240.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class47) var4.next();
        } while (!var5.method269(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ar.c(III)Z")
    public boolean method345(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field246 || var3 > this.field247) {
            return false;
        } else if (var4 >= this.field248 && var4 <= this.field251) {
            Iterator var5 = this.field240.iterator();
            class47 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class47) var5.next();
            } while (!var6.method267(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.y(IIII)[I")
    public int[] method350(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field240.iterator();
        class47 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class47) var4.next();
        } while (!var5.method269(arg0, arg1, arg2));
        return var5.method271(arg0, arg1, arg2);
    }

    @ObfuscatedName("ar.h(III)Lhd;")
    public class223 method369(int arg0, int arg1) {
        Iterator var3 = this.field240.iterator();
        class47 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class47) var3.next();
        } while (!var4.method267(arg0, arg1));
        return var4.method266(arg0, arg1);
    }

    @ObfuscatedName("ar.z(I)V")
    public void method361() {
        Iterator var1 = this.field240.iterator();
        while (var1.hasNext()) {
            class47 var2 = (class47) var1.next();
            var2.method280(this);
        }
    }

    @ObfuscatedName("ar.e(I)I")
    public int method353() {
        return this.field255;
    }

    @ObfuscatedName("ar.q(B)Z")
    public boolean method354() {
        return this.field250;
    }

    @ObfuscatedName("ar.l(I)Ljava/lang/String;")
    public String method355() {
        return this.field241;
    }

    @ObfuscatedName("ar.s(I)Ljava/lang/String;")
    public String method395() {
        return this.field243;
    }

    @ObfuscatedName("ar.b(B)I")
    public int method351() {
        return this.field253;
    }

    @ObfuscatedName("ar.a(I)I")
    public int method358() {
        return this.field245;
    }

    @ObfuscatedName("ar.w(S)I")
    public int method359() {
        return this.field246;
    }

    @ObfuscatedName("ar.k(B)I")
    public int method360() {
        return this.field247;
    }

    @ObfuscatedName("ar.i(I)I")
    public int method409() {
        return this.field248;
    }

    @ObfuscatedName("ar.x(I)I")
    public int method362() {
        return this.field251;
    }

    @ObfuscatedName("ar.g(I)I")
    public int method363() {
        return this.field242.field2560;
    }

    @ObfuscatedName("ar.u(B)I")
    public int method370() {
        return this.field242.field2559;
    }

    @ObfuscatedName("ar.t(B)I")
    public int method365() {
        return this.field242.field2558;
    }

    @ObfuscatedName("ar.p(I)Lhd;")
    public class223 method366() {
        return new class223(this.field242);
    }
}
