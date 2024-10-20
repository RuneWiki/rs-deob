package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qc")
public class class430 extends AbstractQueue {

    @ObfuscatedName("qc.ak")
    public class428[] field4724;

    @ObfuscatedName("qc.al")
    public Map field4721;

    @ObfuscatedName("qc.aj")
    public int field4722;

    @ObfuscatedName("qc.az")
    public final Comparator field4720;

    @ObfuscatedName("qc.af")
    public int field4723;

    public class430(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class430(int arg0, Comparator arg1) {
        this.field4723 = 0;
        this.field4724 = new class428[arg0];
        this.field4721 = new HashMap();
        this.field4720 = arg1;
    }

    @ObfuscatedName("qc.ak(B)V")
    public void method7293() {
        int var1 = (this.field4724.length << 1) + 1;
        this.field4724 = (class428[]) ((class428[]) Arrays.copyOf(this.field4724, var1));
    }

    public int size() {
        return this.field4722;
    }

    public boolean offer(Object arg0) {
        if (this.field4721.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4723++;
        int var2 = this.field4722;
        if (var2 >= this.field4724.length) {
            this.method7293();
        }
        this.field4722++;
        if (var2 == 0) {
            this.field4724[0] = new class428(arg0, 0);
            this.field4721.put(arg0, this.field4724[0]);
        } else {
            this.field4724[var2] = new class428(arg0, var2);
            this.field4721.put(arg0, this.field4724[var2]);
            this.method7309(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4722 == 0 ? null : this.field4724[0].field4714;
    }

    public Object poll() {
        if (this.field4722 == 0) {
            return null;
        }
        this.field4723++;
        Object var1 = this.field4724[0].field4714;
        this.field4721.remove(var1);
        this.field4722--;
        if (this.field4722 == 0) {
            this.field4724[this.field4722] = null;
        } else {
            this.field4724[0] = this.field4724[this.field4722];
            this.field4724[0].field4715 = 0;
            this.field4724[this.field4722] = null;
            this.method7300(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class428 var2 = (class428) this.field4721.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4723++;
        this.field4722--;
        if (this.field4722 == var2.field4715) {
            this.field4724[this.field4722] = null;
            return true;
        }
        class428 var3 = this.field4724[this.field4722];
        this.field4724[this.field4722] = null;
        this.field4724[var2.field4715] = var3;
        this.field4724[var2.field4715].field4715 = var2.field4715;
        this.method7300(var2.field4715);
        if (this.field4724[var2.field4715] == var3) {
            this.method7309(var2.field4715);
        }
        return true;
    }

    @ObfuscatedName("qc.al(IB)V")
    public void method7309(int arg0) {
        class428 var2 = this.field4724[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class428 var4 = this.field4724[var3];
            if (this.field4720 == null) {
                if (((Comparable) var2.field4714).compareTo(var4.field4714) >= 0) {
                    break;
                }
            } else if (this.field4720.compare(var2.field4714, var4.field4714) >= 0) {
                break;
            }
            this.field4724[arg0] = var4;
            this.field4724[arg0].field4715 = arg0;
            arg0 = var3;
        }
        this.field4724[arg0] = var2;
        this.field4724[arg0].field4715 = arg0;
    }

    @ObfuscatedName("qc.aj(II)V")
    public void method7300(int arg0) {
        class428 var2 = this.field4724[arg0];
        int var3 = this.field4722 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class428 var5 = this.field4724[var4];
            int var6 = (arg0 << 1) + 2;
            class428 var7 = this.field4724[var6];
            int var8;
            if (this.field4720 == null) {
                if (var6 < this.field4722 && ((Comparable) var5.field4714).compareTo(var7.field4714) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4722 && this.field4720.compare(var5.field4714, var7.field4714) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4720 == null) {
                if (((Comparable) var2.field4714).compareTo(this.field4724[var8].field4714) <= 0) {
                    break;
                }
            } else if (this.field4720.compare(var2.field4714, this.field4724[var8].field4714) <= 0) {
                break;
            }
            this.field4724[arg0] = this.field4724[var8];
            this.field4724[arg0].field4715 = arg0;
            arg0 = var8;
        }
        this.field4724[arg0] = var2;
        this.field4724[arg0].field4715 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4721.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4720 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4720);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class429(this);
    }
}
