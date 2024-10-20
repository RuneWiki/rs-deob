package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.d")
    public int field436 = -1;

    @ObfuscatedName("al.x")
    public String field433;

    @ObfuscatedName("al.k")
    public String field430;

    @ObfuscatedName("al.z")
    public int field431 = -1;

    @ObfuscatedName("al.v")
    public int field435 = -1;

    @ObfuscatedName("al.m")
    public class220 field434 = null;

    @ObfuscatedName("al.b")
    public int field428 = Integer.MAX_VALUE;

    @ObfuscatedName("al.t")
    public int field432 = 0;

    @ObfuscatedName("al.p")
    public int field429 = Integer.MAX_VALUE;

    @ObfuscatedName("al.r")
    public int field437 = 0;

    @ObfuscatedName("al.l")
    public boolean field438 = false;

    @ObfuscatedName("al.u")
    public LinkedList field439;

    @ObfuscatedName("al.d(Lfr;II)V")
    public void method241(class181 arg0, int arg1) {
        this.field436 = arg1;
        this.field433 = arg0.method3045();
        this.field430 = arg0.method3045();
        this.field434 = new class220(arg0.method3041());
        this.field431 = arg0.method3041();
        arg0.method3204();
        this.field438 = arg0.method3204() == 1;
        this.field435 = arg0.method3204();
        int var3 = arg0.method3204();
        this.field439 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field439.add(this.method242(arg0));
        }
        this.method247();
    }

    @ObfuscatedName("al.x(Lfr;I)Lai;")
    public class43 method242(class181 arg0) {
        int var2 = arg0.method3204();
        class28[] var3 = new class28[] { class28.field368, class28.field378, class28.field370, class28.field369 };
        class28 var4 = (class28) class176.method1702(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field372) {
            case 0:
                var6 = new class31();
                break;
            case 1:
                var6 = new class49();
                break;
            case 2:
                var6 = new class27();
                break;
            case 3:
                var6 = new class39();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method188(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("al.k(IIIB)Z")
    public boolean method243(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field439.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method184(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("al.z(III)Z")
    public boolean method244(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field428 || var3 > this.field432) {
            return false;
        } else if (var4 >= this.field429 && var4 <= this.field437) {
            Iterator var5 = this.field439.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method192(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.v(IIII)[I")
    public int[] method245(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field439.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method184(arg0, arg1, arg2));
        return var5.method186(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.m(IIS)Lhp;")
    public class220 method258(int arg0, int arg1) {
        Iterator var3 = this.field439.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method192(arg0, arg1));
        return var4.method187(arg0, arg1);
    }

    @ObfuscatedName("al.b(I)V")
    public void method247() {
        Iterator var1 = this.field439.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method193(this);
        }
    }

    @ObfuscatedName("al.t(S)I")
    public int method248() {
        return this.field436;
    }

    @ObfuscatedName("al.p(I)Z")
    public boolean method270() {
        return this.field438;
    }

    @ObfuscatedName("al.r(I)Ljava/lang/String;")
    public String method250() {
        return this.field433;
    }

    @ObfuscatedName("al.l(B)Ljava/lang/String;")
    public String method251() {
        return this.field430;
    }

    @ObfuscatedName("al.u(I)I")
    public int method252() {
        return this.field431;
    }

    @ObfuscatedName("al.c(I)I")
    public int method253() {
        return this.field435;
    }

    @ObfuscatedName("al.j(B)I")
    public int method254() {
        return this.field428;
    }

    @ObfuscatedName("al.f(B)I")
    public int method255() {
        return this.field432;
    }

    @ObfuscatedName("al.s(B)I")
    public int method256() {
        return this.field429;
    }

    @ObfuscatedName("al.e(I)I")
    public int method257() {
        return this.field437;
    }

    @ObfuscatedName("al.q(I)I")
    public int method295() {
        return this.field434.field2691;
    }

    @ObfuscatedName("al.h(I)I")
    public int method259() {
        return this.field434.field2690;
    }

    @ObfuscatedName("al.i(S)I")
    public int method260() {
        return this.field434.field2692;
    }

    @ObfuscatedName("al.o(I)Lhp;")
    public class220 method323() {
        return new class220(this.field434);
    }
}
