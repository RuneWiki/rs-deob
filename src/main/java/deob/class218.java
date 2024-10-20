package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("hr")
public class class218 {

    @ObfuscatedName("hr.c")
    public int field2612 = -1;

    @ObfuscatedName("hr.b")
    public String field2604;

    @ObfuscatedName("hr.p")
    public String field2605;

    @ObfuscatedName("hr.m")
    public int field2613 = -1;

    @ObfuscatedName("hr.t")
    public int field2607 = -1;

    @ObfuscatedName("hr.s")
    public class277 field2609 = null;

    @ObfuscatedName("hr.j")
    public int field2603 = Integer.MAX_VALUE;

    @ObfuscatedName("hr.w")
    public int field2610 = 0;

    @ObfuscatedName("hr.n")
    public int field2611 = Integer.MAX_VALUE;

    @ObfuscatedName("hr.r")
    public int field2608 = 0;

    @ObfuscatedName("hr.o")
    public boolean field2606 = false;

    @ObfuscatedName("hr.v")
    public LinkedList field2614;

    @ObfuscatedName("hr.c(Lpi;IB)V")
    public void method4078(class419 arg0, int arg1) {
        this.field2612 = arg1;
        this.field2604 = arg0.method6707();
        this.field2605 = arg0.method6707();
        this.field2609 = new class277(arg0.method6675());
        this.field2613 = arg0.method6675();
        arg0.method6781();
        this.field2606 = arg0.method6781() == 1;
        this.field2607 = arg0.method6781();
        int var3 = arg0.method6781();
        this.field2614 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2614.add(this.method4079(arg0));
        }
        this.method4084();
    }

    @ObfuscatedName("hr.b(Lpi;I)Liv;")
    public class238 method4079(class419 arg0) {
        int var2 = arg0.method6781();
        class226 var3 = (class226) class316.method2616(class226.method4351(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2693) {
            case 0:
                var5 = new class235();
                break;
            case 1:
                var5 = new class217();
                break;
            case 2:
                var5 = new class222();
                break;
            case 3:
                var5 = new class225();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class238) var5).method4054(arg0);
        return (class238) var5;
    }

    @ObfuscatedName("hr.p(IIIB)Z")
    public boolean method4104(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2614.iterator();
        class238 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class238) var4.next();
        } while (!var5.method4051(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("hr.m(III)Z")
    public boolean method4080(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2603 || var3 > this.field2610) {
            return false;
        } else if (var4 >= this.field2611 && var4 <= this.field2608) {
            Iterator var5 = this.field2614.iterator();
            class238 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class238) var5.next();
            } while (!var6.method4049(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hr.t(IIIB)[I")
    public int[] method4086(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2614.iterator();
        class238 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class238) var4.next();
        } while (!var5.method4051(arg0, arg1, arg2));
        return var5.method4053(arg0, arg1, arg2);
    }

    @ObfuscatedName("hr.s(III)Lju;")
    public class277 method4085(int arg0, int arg1) {
        Iterator var3 = this.field2614.iterator();
        class238 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class238) var3.next();
        } while (!var4.method4049(arg0, arg1));
        return var4.method4056(arg0, arg1);
    }

    @ObfuscatedName("hr.j(B)V")
    public void method4084() {
        Iterator var1 = this.field2614.iterator();
        while (var1.hasNext()) {
            class238 var2 = (class238) var1.next();
            var2.method4050(this);
        }
    }

    @ObfuscatedName("hr.w(I)I")
    public int method4087() {
        return this.field2612;
    }

    @ObfuscatedName("hr.n(I)Z")
    public boolean method4081() {
        return this.field2606;
    }

    @ObfuscatedName("hr.r(B)Ljava/lang/String;")
    public String method4132() {
        return this.field2604;
    }

    @ObfuscatedName("hr.o(I)Ljava/lang/String;")
    public String method4109() {
        return this.field2605;
    }

    @ObfuscatedName("hr.v(I)I")
    public int method4089() {
        return this.field2613;
    }

    @ObfuscatedName("hr.d(I)I")
    public int method4127() {
        return this.field2607;
    }

    @ObfuscatedName("hr.h(I)I")
    public int method4091() {
        return this.field2603;
    }

    @ObfuscatedName("hr.g(B)I")
    public int method4092() {
        return this.field2610;
    }

    @ObfuscatedName("hr.e(I)I")
    public int method4138() {
        return this.field2611;
    }

    @ObfuscatedName("hr.a(I)I")
    public int method4094() {
        return this.field2608;
    }

    @ObfuscatedName("hr.u(I)I")
    public int method4095() {
        return this.field2609.field3188;
    }

    @ObfuscatedName("hr.k(S)I")
    public int method4096() {
        return this.field2609.field3193;
    }

    @ObfuscatedName("hr.f(I)I")
    public int method4105() {
        return this.field2609.field3189;
    }

    @ObfuscatedName("hr.l(I)Lju;")
    public class277 method4133() {
        return new class277(this.field2609);
    }
}
