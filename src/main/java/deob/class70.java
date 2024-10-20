package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("by")
public final class class70 implements Runnable {

    @ObfuscatedName("by.l")
    public InputStream field1277;

    @ObfuscatedName("by.b")
    public OutputStream field1273;

    @ObfuscatedName("by.o")
    public Socket field1276;

    @ObfuscatedName("by.w")
    public boolean field1272 = false;

    @ObfuscatedName("by.r")
    public class74 field1275;

    @ObfuscatedName("by.k")
    public class79 field1271;

    @ObfuscatedName("by.z")
    public byte[] field1274;

    @ObfuscatedName("by.g")
    public int field1278 = 0;

    @ObfuscatedName("by.n")
    public int field1279 = 0;

    @ObfuscatedName("by.j")
    public boolean field1280 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1275 = arg1;
        this.field1276 = arg0;
        this.field1276.setSoTimeout(30000);
        this.field1276.setTcpNoDelay(true);
        this.field1277 = this.field1276.getInputStream();
        this.field1273 = this.field1276.getOutputStream();
    }

    @ObfuscatedName("by.w(I)V")
    public void method1402() {
        if (this.field1272) {
            return;
        }
        synchronized (this) {
            this.field1272 = true;
            this.notifyAll();
        }
        if (this.field1271 != null) {
            while (this.field1271.field1397 == 0) {
                class126.method46(1L);
            }
            if (this.field1271.field1397 == 1) {
                try {
                    ((Thread) this.field1271.field1395).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1271 = null;
    }

    public void finalize() {
        this.method1402();
    }

    @ObfuscatedName("by.r(B)I")
    public int method1423() throws IOException {
        return this.field1272 ? 0 : this.field1277.read();
    }

    @ObfuscatedName("by.k(I)I")
    public int method1414() throws IOException {
        return this.field1272 ? 0 : this.field1277.available();
    }

    @ObfuscatedName("by.z([BIII)V")
    public void method1400(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1272) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1277.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("by.g([BIII)V")
    public void method1421(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1272) {
            return;
        }
        if (this.field1280) {
            this.field1280 = false;
            throw new IOException();
        }
        if (this.field1274 == null) {
            this.field1274 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1274[this.field1279] = arg0[arg1 + var5];
                this.field1279 = (this.field1279 + 1) % 5000;
                if ((this.field1278 + 4900) % 5000 == this.field1279) {
                    throw new IOException();
                }
            }
            if (this.field1271 == null) {
                this.field1271 = this.field1275.method1517(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1279 == this.field1278) {
                            if (this.field1272) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1278;
                        if (this.field1279 >= this.field1278) {
                            var4 = this.field1279 - this.field1278;
                        } else {
                            var4 = 5000 - this.field1278;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1273.write(this.field1274, var3, var4);
                    } catch (IOException var12) {
                        this.field1280 = true;
                    }
                    this.field1278 = (this.field1278 + var4) % 5000;
                    try {
                        if (this.field1279 == this.field1278) {
                            this.field1273.flush();
                        }
                    } catch (IOException var11) {
                        this.field1280 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1277 != null) {
                        this.field1277.close();
                    }
                    if (this.field1273 != null) {
                        this.field1273.close();
                    }
                    if (this.field1276 != null) {
                        this.field1276.close();
                    }
                } catch (IOException var10) {
                }
                this.field1274 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method1393((String) null, var15);
        }
    }
}
