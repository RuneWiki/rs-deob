package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pn")
public class class408 extends AbstractQueue {

    @ObfuscatedName("pn.ac")
    public class406[] field4503;

    @ObfuscatedName("pn.al")
    public Map field4500;

    @ObfuscatedName("pn.ak")
    public int field4501;

    @ObfuscatedName("pn.ax")
    public final Comparator field4502;

    @ObfuscatedName("pn.ao")
    public int field4499;

    public class408(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class408(int arg0, Comparator arg1) {
        this.field4499 = 0;
        this.field4503 = new class406[arg0];
        this.field4500 = new HashMap();
        this.field4502 = arg1;
    }

    @ObfuscatedName("pn.ac(I)V")
    public void method6759() {
        int var1 = (this.field4503.length << 1) + 1;
        this.field4503 = (class406[]) ((class406[]) Arrays.copyOf(this.field4503, var1));
    }

    public int size() {
        return this.field4501;
    }

    public boolean offer(Object arg0) {
        if (this.field4500.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4499++;
        int var2 = this.field4501;
        if (var2 >= this.field4503.length) {
            this.method6759();
        }
        this.field4501++;
        if (var2 == 0) {
            this.field4503[0] = new class406(arg0, 0);
            this.field4500.put(arg0, this.field4503[0]);
        } else {
            this.field4503[var2] = new class406(arg0, var2);
            this.field4500.put(arg0, this.field4503[var2]);
            this.method6788(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4501 == 0 ? null : this.field4503[0].field4494;
    }

    public Object poll() {
        if (this.field4501 == 0) {
            return null;
        }
        this.field4499++;
        Object var1 = this.field4503[0].field4494;
        this.field4500.remove(var1);
        this.field4501--;
        if (this.field4501 == 0) {
            this.field4503[this.field4501] = null;
        } else {
            this.field4503[0] = this.field4503[this.field4501];
            this.field4503[0].field4495 = 0;
            this.field4503[this.field4501] = null;
            this.method6764(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class406 var2 = (class406) this.field4500.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4499++;
        this.field4501--;
        if (this.field4501 == var2.field4495) {
            this.field4503[this.field4501] = null;
            return true;
        }
        class406 var3 = this.field4503[this.field4501];
        this.field4503[this.field4501] = null;
        this.field4503[var2.field4495] = var3;
        this.field4503[var2.field4495].field4495 = var2.field4495;
        this.method6764(var2.field4495);
        if (this.field4503[var2.field4495] == var3) {
            this.method6788(var2.field4495);
        }
        return true;
    }

    @ObfuscatedName("pn.al(II)V")
    public void method6788(int arg0) {
        class406 var2 = this.field4503[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class406 var4 = this.field4503[var3];
            if (this.field4502 == null) {
                if (((Comparable) var2.field4494).compareTo(var4.field4494) >= 0) {
                    break;
                }
            } else if (this.field4502.compare(var2.field4494, var4.field4494) >= 0) {
                break;
            }
            this.field4503[arg0] = var4;
            this.field4503[arg0].field4495 = arg0;
            arg0 = var3;
        }
        this.field4503[arg0] = var2;
        this.field4503[arg0].field4495 = arg0;
    }

    @ObfuscatedName("pn.ak(II)V")
    public void method6764(int arg0) {
        class406 var2 = this.field4503[arg0];
        int var3 = this.field4501 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class406 var5 = this.field4503[var4];
            int var6 = (arg0 << 1) + 2;
            class406 var7 = this.field4503[var6];
            int var8;
            if (this.field4502 == null) {
                if (var6 < this.field4501 && ((Comparable) var5.field4494).compareTo(var7.field4494) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4501 && this.field4502.compare(var5.field4494, var7.field4494) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4502 == null) {
                if (((Comparable) var2.field4494).compareTo(this.field4503[var8].field4494) <= 0) {
                    break;
                }
            } else if (this.field4502.compare(var2.field4494, this.field4503[var8].field4494) <= 0) {
                break;
            }
            this.field4503[arg0] = this.field4503[var8];
            this.field4503[arg0].field4495 = arg0;
            arg0 = var8;
        }
        this.field4503[arg0] = var2;
        this.field4503[arg0].field4495 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4500.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4502 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4502);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class407(this);
    }
}
