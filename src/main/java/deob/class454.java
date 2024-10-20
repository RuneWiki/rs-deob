package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("re")
public abstract class class454 {

    @ObfuscatedName("re.ao")
    public final int field4763;

    @ObfuscatedName("re.au")
    public int field4765 = 0;

    @ObfuscatedName("re.ak")
    public class452[] field4764;

    @ObfuscatedName("re.ah")
    public HashMap field4762;

    @ObfuscatedName("re.aj")
    public HashMap field4766;

    @ObfuscatedName("re.af")
    public Comparator field4767 = null;

    public class454(int arg0) {
        this.field4763 = arg0;
        this.field4764 = this.method7488(arg0);
        this.field4762 = new HashMap(arg0 / 8);
        this.field4766 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("re.ba(I)V")
    public void method7587() {
        this.field4765 = 0;
        Arrays.fill(this.field4764, (Object) null);
        this.field4762.clear();
        this.field4766.clear();
    }

    @ObfuscatedName("re.bt(I)I")
    public int method7588() {
        return this.field4765;
    }

    @ObfuscatedName("re.bk(B)Z")
    public boolean method7589() {
        return this.field4765 == this.field4763;
    }

    @ObfuscatedName("re.bm(Lvn;S)Z")
    public boolean method7590(class557 arg0) {
        if (arg0.method9181()) {
            return this.field4762.containsKey(arg0) ? true : this.field4766.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("re.bw(Lvn;I)Lra;")
    public class452 method7592(class557 arg0) {
        class452 var2 = this.method7649(arg0);
        return var2 == null ? this.method7593(arg0) : var2;
    }

    @ObfuscatedName("re.bv(Lvn;I)Lra;")
    public class452 method7649(class557 arg0) {
        return arg0.method9181() ? (class452) this.field4762.get(arg0) : null;
    }

    @ObfuscatedName("re.by(Lvn;I)Lra;")
    public class452 method7593(class557 arg0) {
        return arg0.method9181() ? (class452) this.field4766.get(arg0) : null;
    }

    @ObfuscatedName("re.bb(Lvn;I)Z")
    public final boolean method7594(class557 arg0) {
        class452 var2 = this.method7649(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7595(var2);
            return true;
        }
    }

    @ObfuscatedName("re.bn(Lra;I)V")
    public final void method7595(class452 arg0) {
        int var2 = this.method7600(arg0);
        if (var2 != -1) {
            this.method7604(var2);
            this.method7601(arg0);
        }
    }

    @ObfuscatedName("re.br(Lvn;I)Lra;")
    public class452 method7643(class557 arg0) {
        return this.method7597(arg0, (class557) null);
    }

    @ObfuscatedName("re.bp(Lvn;Lvn;I)Lra;")
    public class452 method7597(class557 arg0, class557 arg1) {
        if (this.method7649(arg0) != null) {
            throw new IllegalStateException();
        }
        class452 var3 = this.method7487();
        var3.method7562(arg0, arg1);
        this.method7602(var3);
        this.method7603(var3);
        return var3;
    }

    @ObfuscatedName("re.bf(IB)Lra;")
    public final class452 method7598(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4765) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4764[arg0];
    }

    @ObfuscatedName("re.bg(B)V")
    public final void method7607() {
        if (this.field4767 == null) {
            Arrays.sort(this.field4764, 0, this.field4765);
        } else {
            Arrays.sort(this.field4764, 0, this.field4765, this.field4767);
        }
    }

    @ObfuscatedName("re.be(Lra;Lvn;Lvn;I)V")
    public final void method7599(class452 arg0, class557 arg1, class557 arg2) {
        this.method7601(arg0);
        arg0.method7562(arg1, arg2);
        this.method7603(arg0);
    }

    @ObfuscatedName("re.bc(Lra;I)I")
    public final int method7600(class452 arg0) {
        for (int var2 = 0; var2 < this.field4765; var2++) {
            if (this.field4764[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("re.bz(Lra;I)V")
    public final void method7601(class452 arg0) {
        if (this.field4762.remove(arg0.field4758) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4759 != null) {
            this.field4766.remove(arg0.field4759);
        }
    }

    @ObfuscatedName("re.bh(Lra;I)V")
    public final void method7602(class452 arg0) {
        this.field4764[++this.field4765 - 1] = arg0;
    }

    @ObfuscatedName("re.bs(Lra;I)V")
    public final void method7603(class452 arg0) {
        this.field4762.put(arg0.field4758, arg0);
        if (arg0.field4759 != null) {
            class452 var2 = (class452) this.field4766.put(arg0.field4759, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4759 = null;
            }
        }
    }

    @ObfuscatedName("re.bj(II)V")
    public final void method7604(int arg0) {
        this.field4765--;
        if (arg0 < this.field4765) {
            System.arraycopy(this.field4764, arg0 + 1, this.field4764, arg0, this.field4765 - arg0);
        }
    }

    @ObfuscatedName("re.bl(B)V")
    public final void method7624() {
        this.field4767 = null;
    }

    @ObfuscatedName("re.bx(Ljava/util/Comparator;I)V")
    public final void method7606(Comparator arg0) {
        if (this.field4767 == null) {
            this.field4767 = arg0;
        } else if (this.field4767 instanceof class453) {
            ((class453) this.field4767).method7577(arg0);
        }
    }

    @ObfuscatedName("re.aw(IS)[Lra;")
    public abstract class452[] method7488(int arg0);

    @ObfuscatedName("re.aq(B)Lra;")
    public abstract class452 method7487();
}
