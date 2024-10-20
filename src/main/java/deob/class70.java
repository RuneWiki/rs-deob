package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bz")
public final class class70 implements Runnable {

    @ObfuscatedName("bz.f")
    public InputStream field1276;

    @ObfuscatedName("bz.t")
    public OutputStream field1269;

    @ObfuscatedName("bz.n")
    public Socket field1270;

    @ObfuscatedName("bz.e")
    public boolean field1271 = false;

    @ObfuscatedName("bz.l")
    public class74 field1272;

    @ObfuscatedName("bz.d")
    public class79 field1273;

    @ObfuscatedName("bz.r")
    public byte[] field1274;

    @ObfuscatedName("bz.k")
    public int field1275 = 0;

    @ObfuscatedName("bz.u")
    public int field1268 = 0;

    @ObfuscatedName("bz.o")
    public boolean field1277 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1272 = arg1;
        this.field1270 = arg0;
        this.field1270.setSoTimeout(30000);
        this.field1270.setTcpNoDelay(true);
        this.field1276 = this.field1270.getInputStream();
        this.field1269 = this.field1270.getOutputStream();
    }

    @ObfuscatedName("bz.l(B)V")
    public void method1397() {
        if (this.field1271) {
            return;
        }
        synchronized (this) {
            this.field1271 = true;
            this.notifyAll();
        }
        if (this.field1273 != null) {
            while (this.field1273.field1392 == 0) {
                class126.method815(1L);
            }
            if (this.field1273.field1392 == 1) {
                try {
                    ((Thread) this.field1273.field1399).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1273 = null;
    }

    public void finalize() {
        this.method1397();
    }

    @ObfuscatedName("bz.d(I)I")
    public int method1403() throws IOException {
        return this.field1271 ? 0 : this.field1276.read();
    }

    @ObfuscatedName("bz.r(I)I")
    public int method1394() throws IOException {
        return this.field1271 ? 0 : this.field1276.available();
    }

    @ObfuscatedName("bz.k([BIIB)V")
    public void method1410(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1271) {
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

    @ObfuscatedName("bz.u([BIII)V")
    public void method1396(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1271) {
            return;
        }
        if (this.field1277) {
            this.field1277 = false;
            throw new IOException();
        }
        if (this.field1274 == null) {
            this.field1274 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1274[this.field1268] = arg0[arg1 + var5];
                this.field1268 = (this.field1268 + 1) % 5000;
                if ((this.field1275 + 4900) % 5000 == this.field1268) {
                    throw new IOException();
                }
            }
            if (this.field1273 == null) {
                this.field1273 = this.field1272.method1507(this, 3);
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
                        if (this.field1275 == this.field1268) {
                            if (this.field1271) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1275;
                        if (this.field1268 >= this.field1275) {
                            var4 = this.field1268 - this.field1275;
                        } else {
                            var4 = 5000 - this.field1275;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1269.write(this.field1274, var3, var4);
                    } catch (IOException var12) {
                        this.field1277 = true;
                    }
                    this.field1275 = (this.field1275 + var4) % 5000;
                    try {
                        if (this.field1275 == this.field1268) {
                            this.field1269.flush();
                        }
                    } catch (IOException var11) {
                        this.field1277 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1276 != null) {
                        this.field1276.close();
                    }
                    if (this.field1269 != null) {
                        this.field1269.close();
                    }
                    if (this.field1270 != null) {
                        this.field1270.close();
                    }
                } catch (IOException var10) {
                }
                this.field1274 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method802((String) null, var15);
        }
    }
}
