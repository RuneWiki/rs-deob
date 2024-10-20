package org.bouncycastle.crypto.modes.gcm;

import java.util.Vector;
import org.bouncycastle.util.Arrays;

public class Tables1kGCMExponentiator implements GCMExponentiator {

    public Vector lookupPowX2;

    public void ensureAvailable(int arg0) {
        int var2 = this.lookupPowX2.size();
        if (var2 > arg0) {
            return;
        }
        int[] var3 = (int[]) ((int[]) this.lookupPowX2.elementAt(var2 - 1));
        do {
            var3 = Arrays.clone(var3);
            GCMUtil.multiply(var3, var3);
            this.lookupPowX2.addElement(var3);
            var2++;
        } while (var2 <= arg0);
    }

    public void exponentiateX(long arg0, byte[] arg1) {
        int[] var4 = GCMUtil.oneAsInts();
        int var5 = 0;
        while (arg0 > 0L) {
            if ((arg0 & 0x1L) != 0L) {
                this.ensureAvailable(var5);
                GCMUtil.multiply(var4, (int[]) ((int[]) this.lookupPowX2.elementAt(var5)));
            }
            var5++;
            arg0 >>>= 0x1;
        }
        GCMUtil.asBytes(var4, arg1);
    }

    public void init(byte[] arg0) {
        int[] var2 = GCMUtil.asInts(arg0);
        if (this.lookupPowX2 == null || !Arrays.areEqual(var2, (int[]) ((int[]) this.lookupPowX2.elementAt(0)))) {
            this.lookupPowX2 = new Vector(8);
            this.lookupPowX2.addElement(var2);
        }
    }
}
