package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("as")
public class class33 {

    @ObfuscatedName("as.d")
    public int field468 = -1;

    @ObfuscatedName("as.k")
    public String field469;

    @ObfuscatedName("as.e")
    public String field470;

    @ObfuscatedName("as.p")
    public int field471 = -1;

    @ObfuscatedName("as.q")
    public int field472 = -1;

    @ObfuscatedName("as.s")
    public class213 field478 = null;

    @ObfuscatedName("as.r")
    public int field474 = Integer.MAX_VALUE;

    @ObfuscatedName("as.g")
    public int field475 = 0;

    @ObfuscatedName("as.v")
    public int field476 = Integer.MAX_VALUE;

    @ObfuscatedName("as.t")
    public int field477 = 0;

    @ObfuscatedName("as.y")
    public boolean field482 = false;

    @ObfuscatedName("as.o")
    public LinkedList field473;

    @ObfuscatedName("as.d(Lfg;II)V")
    public void method238(class174 arg0, int arg1) {
        this.field468 = arg1;
        this.field469 = arg0.method2964();
        this.field470 = arg0.method2964();
        this.field478 = new class213(arg0.method2960());
        this.field471 = arg0.method2960();
        arg0.method2955();
        this.field482 = arg0.method2955() == 1;
        this.field472 = arg0.method2955();
        int var3 = arg0.method2955();
        this.field473 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field473.add(this.method239(arg0));
        }
        this.method273();
    }

    @ObfuscatedName("as.k(Lfg;I)Lap;")
    public class43 method239(class174 arg0) {
        int var2 = arg0.method2955();
        class28 var3 = (class28) class169.method648(class28.method198(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field405) {
            case 0:
                var5 = new class39();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class31();
                break;
            case 3:
                var5 = new class49();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method194(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("as.e(IIII)Z")
    public boolean method240(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field473.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method169(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("as.p(III)Z")
    public boolean method241(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field474 || var3 > this.field475) {
            return false;
        } else if (var4 >= this.field476 && var4 <= this.field477) {
            Iterator var5 = this.field473.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method170(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.q(IIIB)[I")
    public int[] method253(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field473.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method169(arg0, arg1, arg2));
        return var5.method168(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.s(III)Lhl;")
    public class213 method243(int arg0, int arg1) {
        Iterator var3 = this.field473.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method170(arg0, arg1));
        return var4.method177(arg0, arg1);
    }

    @ObfuscatedName("as.r(I)V")
    public void method273() {
        Iterator var1 = this.field473.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method175(this);
        }
    }

    @ObfuscatedName("as.g(I)I")
    public int method281() {
        return this.field468;
    }

    @ObfuscatedName("as.v(B)Z")
    public boolean method246() {
        return this.field482;
    }

    @ObfuscatedName("as.t(I)Ljava/lang/String;")
    public String method247() {
        return this.field469;
    }

    @ObfuscatedName("as.y(B)Ljava/lang/String;")
    public String method248() {
        return this.field470;
    }

    @ObfuscatedName("as.o(B)I")
    public int method242() {
        return this.field471;
    }

    @ObfuscatedName("as.i(I)I")
    public int method260() {
        return this.field472;
    }

    @ObfuscatedName("as.u(I)I")
    public int method284() {
        return this.field474;
    }

    @ObfuscatedName("as.x(I)I")
    public int method258() {
        return this.field475;
    }

    @ObfuscatedName("as.c(I)I")
    public int method301() {
        return this.field476;
    }

    @ObfuscatedName("as.h(I)I")
    public int method291() {
        return this.field477;
    }

    @ObfuscatedName("as.a(I)I")
    public int method255() {
        return this.field478.field2628;
    }

    @ObfuscatedName("as.w(I)I")
    public int method256() {
        return this.field478.field2626;
    }

    @ObfuscatedName("as.n(I)I")
    public int method257() {
        return this.field478.field2625;
    }

    @ObfuscatedName("as.m(I)Lhl;")
    public class213 method294() {
        return new class213(this.field478);
    }
}
