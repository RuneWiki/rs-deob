package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bk")
public final class class70 implements Runnable {

    @ObfuscatedName("bk.p")
    public InputStream field1278;

    @ObfuscatedName("bk.l")
    public OutputStream field1276;

    @ObfuscatedName("bk.d")
    public Socket field1277;

    @ObfuscatedName("bk.x")
    public boolean field1285 = false;

    @ObfuscatedName("bk.o")
    public class74 field1279;

    @ObfuscatedName("bk.a")
    public class79 field1283;

    @ObfuscatedName("bk.w")
    public byte[] field1280;

    @ObfuscatedName("bk.i")
    public int field1282 = 0;

    @ObfuscatedName("bk.y")
    public int field1284 = 0;

    @ObfuscatedName("bk.m")
    public boolean field1275 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1279 = arg1;
        this.field1277 = arg0;
        this.field1277.setSoTimeout(30000);
        this.field1277.setTcpNoDelay(true);
        this.field1278 = this.field1277.getInputStream();
        this.field1276 = this.field1277.getOutputStream();
    }

    @ObfuscatedName("bk.o(I)V")
    public void method1430() {
        if (this.field1285) {
            return;
        }
        synchronized (this) {
            this.field1285 = true;
            this.notifyAll();
        }
        if (this.field1283 != null) {
            while (this.field1283.field1396 == 0) {
                class126.method1463(1L);
            }
            if (this.field1283.field1396 == 1) {
                try {
                    ((Thread) this.field1283.field1398).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1283 = null;
    }

    public void finalize() {
        this.method1430();
    }

    @ObfuscatedName("bk.a(I)I")
    public int method1431() throws IOException {
        return this.field1285 ? 0 : this.field1278.read();
    }

    @ObfuscatedName("bk.w(I)I")
    public int method1429() throws IOException {
        return this.field1285 ? 0 : this.field1278.available();
    }

    @ObfuscatedName("bk.i([BIII)V")
    public void method1433(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1285) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1278.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bk.y([BIIB)V")
    public void method1448(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1285) {
            return;
        }
        if (this.field1275) {
            this.field1275 = false;
            throw new IOException();
        }
        if (this.field1280 == null) {
            this.field1280 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1280[this.field1284] = arg0[arg1 + var5];
                this.field1284 = (this.field1284 + 1) % 5000;
                if ((this.field1282 + 4900) % 5000 == this.field1284) {
                    throw new IOException();
                }
            }
            if (this.field1283 == null) {
                this.field1283 = this.field1279.method1549(this, 3);
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
                        if (this.field1284 == this.field1282) {
                            if (this.field1285) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1282;
                        if (this.field1284 >= this.field1282) {
                            var4 = this.field1284 - this.field1282;
                        } else {
                            var4 = 5000 - this.field1282;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1276.write(this.field1280, var3, var4);
                    } catch (IOException var12) {
                        this.field1275 = true;
                    }
                    this.field1282 = (this.field1282 + var4) % 5000;
                    try {
                        if (this.field1284 == this.field1282) {
                            this.field1276.flush();
                        }
                    } catch (IOException var11) {
                        this.field1275 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1278 != null) {
                        this.field1278.close();
                    }
                    if (this.field1276 != null) {
                        this.field1276.close();
                    }
                    if (this.field1277 != null) {
                        this.field1277.close();
                    }
                } catch (IOException var10) {
                }
                this.field1280 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method2076((String) null, var15);
        }
    }
}
