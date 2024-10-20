package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bf")
public final class class69 implements Runnable {

    @ObfuscatedName("bf.u")
    public InputStream field1274;

    @ObfuscatedName("bf.k")
    public OutputStream field1268;

    @ObfuscatedName("bf.x")
    public Socket field1269;

    @ObfuscatedName("bf.m")
    public boolean field1280 = false;

    @ObfuscatedName("bf.n")
    public class73 field1270;

    @ObfuscatedName("bf.q")
    public class78 field1272;

    @ObfuscatedName("bf.a")
    public byte[] field1273;

    @ObfuscatedName("bf.g")
    public int field1275 = 0;

    @ObfuscatedName("bf.j")
    public int field1271 = 0;

    @ObfuscatedName("bf.l")
    public boolean field1276 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1270 = arg1;
        this.field1269 = arg0;
        this.field1269.setSoTimeout(30000);
        this.field1269.setTcpNoDelay(true);
        this.field1274 = this.field1269.getInputStream();
        this.field1268 = this.field1269.getOutputStream();
    }

    @ObfuscatedName("bf.m(I)V")
    public void method1369() {
        if (this.field1280) {
            return;
        }
        synchronized (this) {
            this.field1280 = true;
            this.notifyAll();
        }
        if (this.field1272 != null) {
            while (this.field1272.field1386 == 0) {
                class125.method1228(1L);
            }
            if (this.field1272.field1386 == 1) {
                try {
                    ((Thread) this.field1272.field1391).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1272 = null;
    }

    public void finalize() {
        this.method1369();
    }

    @ObfuscatedName("bf.n(B)I")
    public int method1371() throws IOException {
        return this.field1280 ? 0 : this.field1274.read();
    }

    @ObfuscatedName("bf.q(I)I")
    public int method1387() throws IOException {
        return this.field1280 ? 0 : this.field1274.available();
    }

    @ObfuscatedName("bf.a([BIIB)V")
    public void method1373(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1280) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1274.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bf.g([BIIS)V")
    public void method1374(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1280) {
            return;
        }
        if (this.field1276) {
            this.field1276 = false;
            throw new IOException();
        }
        if (this.field1273 == null) {
            this.field1273 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1273[this.field1271] = arg0[arg1 + var5];
                this.field1271 = (this.field1271 + 1) % 5000;
                if ((this.field1275 + 4900) % 5000 == this.field1271) {
                    throw new IOException();
                }
            }
            if (this.field1272 == null) {
                this.field1272 = this.field1270.method1483(this, 3);
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
                        if (this.field1275 == this.field1271) {
                            if (this.field1280) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1275;
                        if (this.field1271 >= this.field1275) {
                            var4 = this.field1271 - this.field1275;
                        } else {
                            var4 = 5000 - this.field1275;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1268.write(this.field1273, var3, var4);
                    } catch (IOException var12) {
                        this.field1276 = true;
                    }
                    this.field1275 = (this.field1275 + var4) % 5000;
                    try {
                        if (this.field1275 == this.field1271) {
                            this.field1268.flush();
                        }
                    } catch (IOException var11) {
                        this.field1276 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1274 != null) {
                        this.field1274.close();
                    }
                    if (this.field1268 != null) {
                        this.field1268.close();
                    }
                    if (this.field1269 != null) {
                        this.field1269.close();
                    }
                } catch (IOException var10) {
                }
                this.field1273 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method1474((String) null, var15);
        }
    }
}
