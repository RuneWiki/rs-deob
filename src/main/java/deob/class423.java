package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("qo")
public abstract class class423 {

    @ObfuscatedName("qo.ae")
    public final int field4603;

    @ObfuscatedName("qo.af")
    public int field4604 = 0;

    @ObfuscatedName("qo.ao")
    public class421[] field4607;

    @ObfuscatedName("qo.aa")
    public HashMap field4606;

    @ObfuscatedName("qo.aj")
    public HashMap field4608;

    @ObfuscatedName("qo.ad")
    public Comparator field4605 = null;

    public class423(int arg0) {
        this.field4603 = arg0;
        this.field4607 = this.method7070(arg0);
        this.field4606 = new HashMap(arg0 / 8);
        this.field4608 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("qo.bq(I)V")
    public void method7216() {
        this.field4604 = 0;
        Arrays.fill(this.field4607, (Object) null);
        this.field4606.clear();
        this.field4608.clear();
    }

    @ObfuscatedName("qo.bg(I)I")
    public int method7181() {
        return this.field4604;
    }

    @ObfuscatedName("qo.bf(B)Z")
    public boolean method7220() {
        return this.field4604 == this.field4603;
    }

    @ObfuscatedName("qo.bd(Lun;B)Z")
    public boolean method7176(class525 arg0) {
        if (arg0.method8772()) {
            return this.field4606.containsKey(arg0) ? true : this.field4608.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("qo.ba(Lun;I)Lqm;")
    public class421 method7177(class525 arg0) {
        class421 var2 = this.method7178(arg0);
        return var2 == null ? this.method7172(arg0) : var2;
    }

    @ObfuscatedName("qo.bn(Lun;I)Lqm;")
    public class421 method7178(class525 arg0) {
        return arg0.method8772() ? (class421) this.field4606.get(arg0) : null;
    }

    @ObfuscatedName("qo.bb(Lun;I)Lqm;")
    public class421 method7172(class525 arg0) {
        return arg0.method8772() ? (class421) this.field4608.get(arg0) : null;
    }

    @ObfuscatedName("qo.bx(Lun;I)Z")
    public final boolean method7180(class525 arg0) {
        class421 var2 = this.method7178(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7232(var2);
            return true;
        }
    }

    @ObfuscatedName("qo.be(Lqm;I)V")
    public final void method7232(class421 arg0) {
        int var2 = this.method7187(arg0);
        if (var2 != -1) {
            this.method7195(var2);
            this.method7188(arg0);
        }
    }

    @ObfuscatedName("qo.bh(Lun;I)Lqm;")
    public class421 method7242(class525 arg0) {
        return this.method7183(arg0, (class525) null);
    }

    @ObfuscatedName("qo.bp(Lun;Lun;I)Lqm;")
    public class421 method7183(class525 arg0, class525 arg1) {
        if (this.method7178(arg0) != null) {
            throw new IllegalStateException();
        }
        class421 var3 = this.method7075();
        var3.method7149(arg0, arg1);
        this.method7189(var3);
        this.method7175(var3);
        return var3;
    }

    @ObfuscatedName("qo.bw(IB)Lqm;")
    public final class421 method7184(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4604) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4607[arg0];
    }

    @ObfuscatedName("qo.bi(I)V")
    public final void method7185() {
        if (this.field4605 == null) {
            Arrays.sort(this.field4607, 0, this.field4604);
        } else {
            Arrays.sort(this.field4607, 0, this.field4604, this.field4605);
        }
    }

    @ObfuscatedName("qo.bk(Lqm;Lun;Lun;S)V")
    public final void method7186(class421 arg0, class525 arg1, class525 arg2) {
        this.method7188(arg0);
        arg0.method7149(arg1, arg2);
        this.method7175(arg0);
    }

    @ObfuscatedName("qo.bv(Lqm;B)I")
    public final int method7187(class421 arg0) {
        for (int var2 = 0; var2 < this.field4604; var2++) {
            if (this.field4607[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("qo.bz(Lqm;I)V")
    public final void method7188(class421 arg0) {
        if (this.field4606.remove(arg0.field4599) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4600 != null) {
            this.field4608.remove(arg0.field4600);
        }
    }

    @ObfuscatedName("qo.bm(Lqm;I)V")
    public final void method7189(class421 arg0) {
        this.field4607[++this.field4604 - 1] = arg0;
    }

    @ObfuscatedName("qo.br(Lqm;I)V")
    public final void method7175(class421 arg0) {
        this.field4606.put(arg0.field4599, arg0);
        if (arg0.field4600 != null) {
            class421 var2 = (class421) this.field4608.put(arg0.field4600, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4600 = null;
            }
        }
    }

    @ObfuscatedName("qo.bu(II)V")
    public final void method7195(int arg0) {
        this.field4604--;
        if (arg0 < this.field4604) {
            System.arraycopy(this.field4607, arg0 + 1, this.field4607, arg0, this.field4604 - arg0);
        }
    }

    @ObfuscatedName("qo.by(I)V")
    public final void method7238() {
        this.field4605 = null;
    }

    @ObfuscatedName("qo.bt(Ljava/util/Comparator;I)V")
    public final void method7193(Comparator arg0) {
        if (this.field4605 == null) {
            this.field4605 = arg0;
        } else if (this.field4605 instanceof class422) {
            ((class422) this.field4605).method7164(arg0);
        }
    }

    @ObfuscatedName("qo.at(I)Lqm;")
    public abstract class421 method7075();

    @ObfuscatedName("qo.an(IB)[Lqm;")
    public abstract class421[] method7070(int arg0);
}
