package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class StreamUtil {

    public static final long MAX_MEMORY = Runtime.getRuntime().maxMemory();

    public static int findLimit(InputStream arg0) {
        if (arg0 instanceof LimitedInputStream) {
            return ((LimitedInputStream) arg0).getRemaining();
        } else if (arg0 instanceof ASN1InputStream) {
            return ((ASN1InputStream) arg0).getLimit();
        } else if (arg0 instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) arg0).available();
        } else {
            if (arg0 instanceof FileInputStream) {
                try {
                    FileChannel var1 = ((FileInputStream) arg0).getChannel();
                    long var2 = var1 == null ? 2147483647L : var1.size();
                    if (var2 < 2147483647L) {
                        return (int) var2;
                    }
                } catch (IOException var5) {
                }
            }
            return MAX_MEMORY > 2147483647L ? Integer.MAX_VALUE : (int) MAX_MEMORY;
        }
    }

    public static int calculateTagLength(int arg0) throws IOException {
        int var1 = 1;
        if (arg0 >= 31) {
            if (arg0 < 128) {
                var1++;
            } else {
                byte[] var2 = new byte[5];
                int var3 = var2.length;
                var3--;
                var2[var3] = (byte) (arg0 & 0x7F);
                do {
                    arg0 >>= 0x7;
                    var3--;
                    var2[var3] = (byte) (arg0 & 0x7F | 0x80);
                } while (arg0 > 127);
                var1 += var2.length - var3;
            }
        }
        return var1;
    }

    public static int calculateBodyLength(int arg0) {
        int var1 = 1;
        if (arg0 > 127) {
            int var2 = 1;
            int var3 = arg0;
            while ((var3 >>>= 0x8) != 0) {
                var2++;
            }
            for (int var4 = (var2 - 1) * 8; var4 >= 0; var4 -= 8) {
                var1++;
            }
        }
        return var1;
    }
}
