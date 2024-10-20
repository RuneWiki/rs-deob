package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ph")
public abstract class class406 {

    @ObfuscatedName("ph.ap")
    public final int field4528;

    @ObfuscatedName("ph.ar")
    public int field4526 = 0;

    @ObfuscatedName("ph.ak")
    public class404[] field4529;

    @ObfuscatedName("ph.ax")
    public HashMap field4525;

    @ObfuscatedName("ph.as")
    public HashMap field4527;

    @ObfuscatedName("ph.ay")
    public Comparator field4530 = null;

    public class406(int arg0) {
        this.field4528 = arg0;
        this.field4529 = this.method6844(arg0);
        this.field4525 = new HashMap(arg0 / 8);
        this.field4527 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ph.ba(I)V")
    public void method6997() {
        this.field4526 = 0;
        Arrays.fill(this.field4529, (Object) null);
        this.field4525.clear();
        this.field4527.clear();
    }

    @ObfuscatedName("ph.bz(I)I")
    public int method6951() {
        return this.field4526;
    }

    @ObfuscatedName("ph.bq(I)Z")
    public boolean method6952() {
        return this.field4528 == this.field4526;
    }

    @ObfuscatedName("ph.bc(Ltj;I)Z")
    public boolean method6953(class501 arg0) {
        if (arg0.method8489()) {
            return this.field4525.containsKey(arg0) ? true : this.field4527.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ph.bt(Ltj;B)Lpb;")
    public class404 method6954(class501 arg0) {
        class404 var2 = this.method6955(arg0);
        return var2 == null ? this.method6956(arg0) : var2;
    }

    @ObfuscatedName("ph.be(Ltj;I)Lpb;")
    public class404 method6955(class501 arg0) {
        return arg0.method8489() ? (class404) this.field4525.get(arg0) : null;
    }

    @ObfuscatedName("ph.bu(Ltj;I)Lpb;")
    public class404 method6956(class501 arg0) {
        return arg0.method8489() ? (class404) this.field4527.get(arg0) : null;
    }

    @ObfuscatedName("ph.bd(Ltj;I)Z")
    public final boolean method6973(class501 arg0) {
        class404 var2 = this.method6955(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6974(var2);
            return true;
        }
    }

    @ObfuscatedName("ph.by(Lpb;I)V")
    public final void method6974(class404 arg0) {
        int var2 = this.method6964(arg0);
        if (var2 != -1) {
            this.method6968(var2);
            this.method6965(arg0);
        }
    }

    @ObfuscatedName("ph.bp(Ltj;I)Lpb;")
    public class404 method7018(class501 arg0) {
        return this.method6989(arg0, (class501) null);
    }

    @ObfuscatedName("ph.bb(Ltj;Ltj;I)Lpb;")
    public class404 method6989(class501 arg0, class501 arg1) {
        if (this.method6955(arg0) != null) {
            throw new IllegalStateException();
        }
        class404 var3 = this.method6843();
        var3.method6935(arg0, arg1);
        this.method6966(var3);
        this.method6967(var3);
        return var3;
    }

    @ObfuscatedName("ph.bx(II)Lpb;")
    public final class404 method6988(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4526) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4529[arg0];
    }

    @ObfuscatedName("ph.bn(I)V")
    public final void method6962() {
        if (this.field4530 == null) {
            Arrays.sort(this.field4529, 0, this.field4526);
        } else {
            Arrays.sort(this.field4529, 0, this.field4526, this.field4530);
        }
    }

    @ObfuscatedName("ph.bj(Lpb;Ltj;Ltj;I)V")
    public final void method6963(class404 arg0, class501 arg1, class501 arg2) {
        this.method6965(arg0);
        arg0.method6935(arg1, arg2);
        this.method6967(arg0);
    }

    @ObfuscatedName("ph.bf(Lpb;B)I")
    public final int method6964(class404 arg0) {
        for (int var2 = 0; var2 < this.field4526; var2++) {
            if (this.field4529[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ph.bw(Lpb;B)V")
    public final void method6965(class404 arg0) {
        if (this.field4525.remove(arg0.field4523) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4520 != null) {
            this.field4527.remove(arg0.field4520);
        }
    }

    @ObfuscatedName("ph.bi(Lpb;B)V")
    public final void method6966(class404 arg0) {
        this.field4529[++this.field4526 - 1] = arg0;
    }

    @ObfuscatedName("ph.cl(Lpb;I)V")
    public final void method6967(class404 arg0) {
        this.field4525.put(arg0.field4523, arg0);
        if (arg0.field4520 != null) {
            class404 var2 = (class404) this.field4527.put(arg0.field4520, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4520 = null;
            }
        }
    }

    @ObfuscatedName("ph.ca(II)V")
    public final void method6968(int arg0) {
        this.field4526--;
        if (arg0 < this.field4526) {
            System.arraycopy(this.field4529, arg0 + 1, this.field4529, arg0, this.field4526 - arg0);
        }
    }

    @ObfuscatedName("ph.cb(I)V")
    public final void method6969() {
        this.field4530 = null;
    }

    @ObfuscatedName("ph.co(Ljava/util/Comparator;I)V")
    public final void method6972(Comparator arg0) {
        if (this.field4530 == null) {
            this.field4530 = arg0;
        } else if (this.field4530 instanceof class405) {
            ((class405) this.field4530).method6938(arg0);
        }
    }

    @ObfuscatedName("ph.aj(I)Lpb;")
    public abstract class404 method6843();

    @ObfuscatedName("ph.al(IB)[Lpb;")
    public abstract class404[] method6844(int arg0);
}
