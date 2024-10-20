package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bz")
public final class class70 implements Runnable {

    @ObfuscatedName("bz.g")
    public InputStream field1276;

    @ObfuscatedName("bz.m")
    public OutputStream field1270;

    @ObfuscatedName("bz.v")
    public Socket field1278;

    @ObfuscatedName("bz.r")
    public boolean field1280 = false;

    @ObfuscatedName("bz.n")
    public class74 field1273;

    @ObfuscatedName("bz.i")
    public class79 field1274;

    @ObfuscatedName("bz.s")
    public byte[] field1275;

    @ObfuscatedName("bz.w")
    public int field1269 = 0;

    @ObfuscatedName("bz.d")
    public int field1277 = 0;

    @ObfuscatedName("bz.t")
    public boolean field1272 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1273 = arg1;
        this.field1278 = arg0;
        this.field1278.setSoTimeout(30000);
        this.field1278.setTcpNoDelay(true);
        this.field1276 = this.field1278.getInputStream();
        this.field1270 = this.field1278.getOutputStream();
    }

    @ObfuscatedName("bz.v(I)V")
    public void method1410() {
        if (this.field1280) {
            return;
        }
        synchronized (this) {
            this.field1280 = true;
            this.notifyAll();
        }
        if (this.field1274 != null) {
            while (this.field1274.field1401 == 0) {
                class126.method209(1L);
            }
            if (this.field1274.field1401 == 1) {
                try {
                    ((Thread) this.field1274.field1408).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1274 = null;
    }

    public void finalize() {
        this.method1410();
    }

    @ObfuscatedName("bz.r(I)I")
    public int method1408() throws IOException {
        return this.field1280 ? 0 : this.field1276.read();
    }

    @ObfuscatedName("bz.n(B)I")
    public int method1388() throws IOException {
        return this.field1280 ? 0 : this.field1276.available();
    }

    @ObfuscatedName("bz.i([BIIB)V")
    public void method1389(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1280) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1276.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bz.s([BIIS)V")
    public void method1395(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1280) {
            return;
        }
        if (this.field1272) {
            this.field1272 = false;
            throw new IOException();
        }
        if (this.field1275 == null) {
            this.field1275 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1275[this.field1277] = arg0[arg1 + var5];
                this.field1277 = (this.field1277 + 1) % 5000;
                if ((this.field1269 + 4900) % 5000 == this.field1277) {
                    throw new IOException();
                }
            }
            if (this.field1274 == null) {
                this.field1274 = this.field1273.method1498(this, 3);
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
                        if (this.field1277 == this.field1269) {
                            if (this.field1280) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1269;
                        if (this.field1277 >= this.field1269) {
                            var4 = this.field1277 - this.field1269;
                        } else {
                            var4 = 5000 - this.field1269;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1270.write(this.field1275, var3, var4);
                    } catch (IOException var12) {
                        this.field1272 = true;
                    }
                    this.field1269 = (this.field1269 + var4) % 5000;
                    try {
                        if (this.field1277 == this.field1269) {
                            this.field1270.flush();
                        }
                    } catch (IOException var11) {
                        this.field1272 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1276 != null) {
                        this.field1276.close();
                    }
                    if (this.field1270 != null) {
                        this.field1270.close();
                    }
                    if (this.field1278 != null) {
                        this.field1278.close();
                    }
                } catch (IOException var10) {
                }
                this.field1275 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method815((String) null, var15);
        }
    }
}
