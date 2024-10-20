package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qr")
public class class435 extends AbstractQueue {

    @ObfuscatedName("qr.ap")
    public class433[] field4815;

    @ObfuscatedName("qr.aw")
    public Map field4812;

    @ObfuscatedName("qr.ak")
    public int field4814;

    @ObfuscatedName("qr.aj")
    public final Comparator field4813;

    @ObfuscatedName("qr.ai")
    public int field4816;

    public class435(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class435(int arg0, Comparator arg1) {
        this.field4816 = 0;
        this.field4815 = new class433[arg0];
        this.field4812 = new HashMap();
        this.field4813 = arg1;
    }

    @ObfuscatedName("qr.ap(B)V")
    public void method7738() {
        int var1 = (this.field4815.length << 1) + 1;
        this.field4815 = (class433[]) ((class433[]) Arrays.copyOf(this.field4815, var1));
    }

    public int size() {
        return this.field4814;
    }

    public boolean offer(Object arg0) {
        if (this.field4812.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4816++;
        int var2 = this.field4814;
        if (var2 >= this.field4815.length) {
            this.method7738();
        }
        this.field4814++;
        if (var2 == 0) {
            this.field4815[0] = new class433(arg0, 0);
            this.field4812.put(arg0, this.field4815[0]);
        } else {
            this.field4815[var2] = new class433(arg0, var2);
            this.field4812.put(arg0, this.field4815[var2]);
            this.method7740(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4814 == 0 ? null : this.field4815[0].field4803;
    }

    public Object poll() {
        if (this.field4814 == 0) {
            return null;
        }
        this.field4816++;
        Object var1 = this.field4815[0].field4803;
        this.field4812.remove(var1);
        this.field4814--;
        if (this.field4814 == 0) {
            this.field4815[this.field4814] = null;
        } else {
            this.field4815[0] = this.field4815[this.field4814];
            this.field4815[0].field4804 = 0;
            this.field4815[this.field4814] = null;
            this.method7741(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class433 var2 = (class433) this.field4812.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4816++;
        this.field4814--;
        if (this.field4814 == var2.field4804) {
            this.field4815[this.field4814] = null;
            return true;
        }
        class433 var3 = this.field4815[this.field4814];
        this.field4815[this.field4814] = null;
        this.field4815[var2.field4804] = var3;
        this.field4815[var2.field4804].field4804 = var2.field4804;
        this.method7741(var2.field4804);
        if (this.field4815[var2.field4804] == var3) {
            this.method7740(var2.field4804);
        }
        return true;
    }

    @ObfuscatedName("qr.aw(IB)V")
    public void method7740(int arg0) {
        class433 var2 = this.field4815[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class433 var4 = this.field4815[var3];
            if (this.field4813 == null) {
                if (((Comparable) var2.field4803).compareTo(var4.field4803) >= 0) {
                    break;
                }
            } else if (this.field4813.compare(var2.field4803, var4.field4803) >= 0) {
                break;
            }
            this.field4815[arg0] = var4;
            this.field4815[arg0].field4804 = arg0;
            arg0 = var3;
        }
        this.field4815[arg0] = var2;
        this.field4815[arg0].field4804 = arg0;
    }

    @ObfuscatedName("qr.ak(IB)V")
    public void method7741(int arg0) {
        class433 var2 = this.field4815[arg0];
        int var3 = this.field4814 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class433 var5 = this.field4815[var4];
            int var6 = (arg0 << 1) + 2;
            class433 var7 = this.field4815[var6];
            int var8;
            if (this.field4813 == null) {
                if (var6 < this.field4814 && ((Comparable) var5.field4803).compareTo(var7.field4803) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4814 && this.field4813.compare(var5.field4803, var7.field4803) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4813 == null) {
                if (((Comparable) var2.field4803).compareTo(this.field4815[var8].field4803) <= 0) {
                    break;
                }
            } else if (this.field4813.compare(var2.field4803, this.field4815[var8].field4803) <= 0) {
                break;
            }
            this.field4815[arg0] = this.field4815[var8];
            this.field4815[arg0].field4804 = arg0;
            arg0 = var8;
        }
        this.field4815[arg0] = var2;
        this.field4815[arg0].field4804 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4812.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4813 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4813);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class434(this);
    }
}
