package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bq")
public final class class70 implements Runnable {

    @ObfuscatedName("bq.i")
    public OutputStream field1282;

    @ObfuscatedName("bq.w")
    public InputStream field1293;

    @ObfuscatedName("bq.f")
    public Socket field1283;

    @ObfuscatedName("bq.e")
    public boolean field1292 = false;

    @ObfuscatedName("bq.t")
    public class74 field1285;

    @ObfuscatedName("bq.d")
    public class79 field1281;

    @ObfuscatedName("bq.p")
    public byte[] field1287;

    @ObfuscatedName("bq.k")
    public int field1288 = 0;

    @ObfuscatedName("bq.r")
    public int field1289 = 0;

    @ObfuscatedName("bq.l")
    public boolean field1290 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1285 = arg1;
        this.field1283 = arg0;
        this.field1283.setSoTimeout(30000);
        this.field1283.setTcpNoDelay(true);
        this.field1293 = this.field1283.getInputStream();
        this.field1282 = this.field1283.getOutputStream();
    }

    @ObfuscatedName("bq.e(B)V")
    public void method1363() {
        if (this.field1292) {
            return;
        }
        synchronized (this) {
            this.field1292 = true;
            this.notifyAll();
        }
        if (this.field1281 != null) {
            while (this.field1281.field1409 == 0) {
                class126.method738(1L);
            }
            if (this.field1281.field1409 == 1) {
                try {
                    ((Thread) this.field1281.field1411).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1281 = null;
    }

    public void finalize() {
        this.method1363();
    }

    @ObfuscatedName("bq.t(I)I")
    public int method1364() throws IOException {
        return this.field1292 ? 0 : this.field1293.read();
    }

    @ObfuscatedName("bq.d(B)I")
    public int method1365() throws IOException {
        return this.field1292 ? 0 : this.field1293.available();
    }

    @ObfuscatedName("bq.p([BIIS)V")
    public void method1388(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1292) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1293.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bq.k([BIIB)V")
    public void method1366(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1292) {
            return;
        }
        if (this.field1290) {
            this.field1290 = false;
            throw new IOException();
        }
        if (this.field1287 == null) {
            this.field1287 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1287[this.field1289] = arg0[arg1 + var5];
                this.field1289 = (this.field1289 + 1) % 5000;
                if ((this.field1288 + 4900) % 5000 == this.field1289) {
                    throw new IOException();
                }
            }
            if (this.field1281 == null) {
                this.field1281 = this.field1285.method1475(this, 3);
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
                        if (this.field1289 == this.field1288) {
                            if (this.field1292) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1288;
                        if (this.field1289 >= this.field1288) {
                            var4 = this.field1289 - this.field1288;
                        } else {
                            var4 = 5000 - this.field1288;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1282.write(this.field1287, var3, var4);
                    } catch (IOException var12) {
                        this.field1290 = true;
                    }
                    this.field1288 = (this.field1288 + var4) % 5000;
                    try {
                        if (this.field1289 == this.field1288) {
                            this.field1282.flush();
                        }
                    } catch (IOException var11) {
                        this.field1290 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1293 != null) {
                        this.field1293.close();
                    }
                    if (this.field1282 != null) {
                        this.field1282.close();
                    }
                    if (this.field1283 != null) {
                        this.field1283.close();
                    }
                } catch (IOException var10) {
                }
                this.field1287 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method4((String) null, var15);
        }
    }
}
