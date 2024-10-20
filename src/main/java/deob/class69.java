package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bv")
public final class class69 implements Runnable {

    @ObfuscatedName("bv.p")
    public InputStream field1285;

    @ObfuscatedName("bv.j")
    public OutputStream field1268;

    @ObfuscatedName("bv.w")
    public Socket field1269;

    @ObfuscatedName("bv.h")
    public boolean field1275 = false;

    @ObfuscatedName("bv.v")
    public class73 field1271;

    @ObfuscatedName("bv.k")
    public class78 field1272;

    @ObfuscatedName("bv.g")
    public byte[] field1282;

    @ObfuscatedName("bv.n")
    public int field1274 = 0;

    @ObfuscatedName("bv.c")
    public int field1283 = 0;

    @ObfuscatedName("bv.o")
    public boolean field1270 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1271 = arg1;
        this.field1269 = arg0;
        this.field1269.setSoTimeout(30000);
        this.field1269.setTcpNoDelay(true);
        this.field1285 = this.field1269.getInputStream();
        this.field1268 = this.field1269.getOutputStream();
    }

    @ObfuscatedName("bv.h(I)V")
    public void method1335() {
        if (this.field1275) {
            return;
        }
        synchronized (this) {
            this.field1275 = true;
            this.notifyAll();
        }
        if (this.field1272 != null) {
            while (this.field1272.field1410 == 0) {
                class125.method123(1L);
            }
            if (this.field1272.field1410 == 1) {
                try {
                    ((Thread) this.field1272.field1414).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1272 = null;
    }

    public void finalize() {
        this.method1335();
    }

    @ObfuscatedName("bv.v(B)I")
    public int method1346() throws IOException {
        return this.field1275 ? 0 : this.field1285.read();
    }

    @ObfuscatedName("bv.k(I)I")
    public int method1355() throws IOException {
        return this.field1275 ? 0 : this.field1285.available();
    }

    @ObfuscatedName("bv.g([BIII)V")
    public void method1338(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1275) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1285.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bv.n([BIII)V")
    public void method1339(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1275) {
            return;
        }
        if (this.field1270) {
            this.field1270 = false;
            throw new IOException();
        }
        if (this.field1282 == null) {
            this.field1282 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1282[this.field1283] = arg0[arg1 + var5];
                this.field1283 = (this.field1283 + 1) % 5000;
                if ((this.field1274 + 4900) % 5000 == this.field1283) {
                    throw new IOException();
                }
            }
            if (this.field1272 == null) {
                this.field1272 = this.field1271.method1458(this, 3);
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
                        if (this.field1283 == this.field1274) {
                            if (this.field1275) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1274;
                        if (this.field1283 >= this.field1274) {
                            var4 = this.field1283 - this.field1274;
                        } else {
                            var4 = 5000 - this.field1274;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1268.write(this.field1282, var3, var4);
                    } catch (IOException var12) {
                        this.field1270 = true;
                    }
                    this.field1274 = (this.field1274 + var4) % 5000;
                    try {
                        if (this.field1283 == this.field1274) {
                            this.field1268.flush();
                        }
                    } catch (IOException var11) {
                        this.field1270 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1285 != null) {
                        this.field1285.close();
                    }
                    if (this.field1268 != null) {
                        this.field1268.close();
                    }
                    if (this.field1269 != null) {
                        this.field1269.close();
                    }
                } catch (IOException var10) {
                }
                this.field1282 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method720((String) null, var15);
        }
    }
}
