package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bm")
public final class class70 implements Runnable {

    @ObfuscatedName("bm.b")
    public InputStream field1274;

    @ObfuscatedName("bm.e")
    public OutputStream field1275;

    @ObfuscatedName("bm.g")
    public Socket field1276;

    @ObfuscatedName("bm.o")
    public boolean field1277 = false;

    @ObfuscatedName("bm.a")
    public class74 field1278;

    @ObfuscatedName("bm.h")
    public class79 field1283;

    @ObfuscatedName("bm.j")
    public byte[] field1280;

    @ObfuscatedName("bm.f")
    public int field1281 = 0;

    @ObfuscatedName("bm.q")
    public int field1282 = 0;

    @ObfuscatedName("bm.l")
    public boolean field1286 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1278 = arg1;
        this.field1276 = arg0;
        this.field1276.setSoTimeout(30000);
        this.field1276.setTcpNoDelay(true);
        this.field1274 = this.field1276.getInputStream();
        this.field1275 = this.field1276.getOutputStream();
    }

    @ObfuscatedName("bm.a(I)V")
    public void method1381() {
        if (this.field1277) {
            return;
        }
        synchronized (this) {
            this.field1277 = true;
            this.notifyAll();
        }
        if (this.field1283 != null) {
            while (this.field1283.field1393 == 0) {
                class127.method686(1L);
            }
            if (this.field1283.field1393 == 1) {
                try {
                    ((Thread) this.field1283.field1397).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1283 = null;
    }

    public void finalize() {
        this.method1381();
    }

    @ObfuscatedName("bm.h(B)I")
    public int method1359() throws IOException {
        return this.field1277 ? 0 : this.field1274.read();
    }

    @ObfuscatedName("bm.j(B)I")
    public int method1357() throws IOException {
        return this.field1277 ? 0 : this.field1274.available();
    }

    @ObfuscatedName("bm.f([BIII)V")
    public void method1360(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1277) {
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

    @ObfuscatedName("bm.q([BIII)V")
    public void method1362(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1277) {
            return;
        }
        if (this.field1286) {
            this.field1286 = false;
            throw new IOException();
        }
        if (this.field1280 == null) {
            this.field1280 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1280[this.field1282] = arg0[arg1 + var5];
                this.field1282 = (this.field1282 + 1) % 5000;
                if ((this.field1281 + 4900) % 5000 == this.field1282) {
                    throw new IOException();
                }
            }
            if (this.field1283 == null) {
                this.field1283 = this.field1278.method1480(this, 3);
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
                        if (this.field1282 == this.field1281) {
                            if (this.field1277) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1281;
                        if (this.field1282 >= this.field1281) {
                            var4 = this.field1282 - this.field1281;
                        } else {
                            var4 = 5000 - this.field1281;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1275.write(this.field1280, var3, var4);
                    } catch (IOException var12) {
                        this.field1286 = true;
                    }
                    this.field1281 = (this.field1281 + var4) % 5000;
                    try {
                        if (this.field1282 == this.field1281) {
                            this.field1275.flush();
                        }
                    } catch (IOException var11) {
                        this.field1286 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1274 != null) {
                        this.field1274.close();
                    }
                    if (this.field1275 != null) {
                        this.field1275.close();
                    }
                    if (this.field1276 != null) {
                        this.field1276.close();
                    }
                } catch (IOException var10) {
                }
                this.field1280 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method1557((String) null, var15);
        }
    }
}
