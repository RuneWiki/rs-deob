package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bq")
public final class class69 implements Runnable {

    @ObfuscatedName("bq.c")
    public InputStream field1271;

    @ObfuscatedName("bq.j")
    public OutputStream field1260;

    @ObfuscatedName("bq.f")
    public Socket field1272;

    @ObfuscatedName("bq.y")
    public boolean field1267 = false;

    @ObfuscatedName("bq.x")
    public class73 field1263;

    @ObfuscatedName("bq.e")
    public class78 field1261;

    @ObfuscatedName("bq.m")
    public byte[] field1265;

    @ObfuscatedName("bq.s")
    public int field1266 = 0;

    @ObfuscatedName("bq.p")
    public int field1259 = 0;

    @ObfuscatedName("bq.w")
    public boolean field1268 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1263 = arg1;
        this.field1272 = arg0;
        this.field1272.setSoTimeout(30000);
        this.field1272.setTcpNoDelay(true);
        this.field1271 = this.field1272.getInputStream();
        this.field1260 = this.field1272.getOutputStream();
    }

    @ObfuscatedName("bq.f(I)V")
    public void method1340() {
        if (this.field1267) {
            return;
        }
        synchronized (this) {
            this.field1267 = true;
            this.notifyAll();
        }
        if (this.field1261 != null) {
            while (this.field1261.field1385 == 0) {
                class126.method2308(1L);
            }
            if (this.field1261.field1385 == 1) {
                try {
                    ((Thread) this.field1261.field1384).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1261 = null;
    }

    public void finalize() {
        this.method1340();
    }

    @ObfuscatedName("bq.y(I)I")
    public int method1325() throws IOException {
        return this.field1267 ? 0 : this.field1271.read();
    }

    @ObfuscatedName("bq.x(I)I")
    public int method1326() throws IOException {
        return this.field1267 ? 0 : this.field1271.available();
    }

    @ObfuscatedName("bq.e([BIII)V")
    public void method1329(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1267) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1271.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bq.m([BIII)V")
    public void method1328(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1267) {
            return;
        }
        if (this.field1268) {
            this.field1268 = false;
            throw new IOException();
        }
        if (this.field1265 == null) {
            this.field1265 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1265[this.field1259] = arg0[arg1 + var5];
                this.field1259 = (this.field1259 + 1) % 5000;
                if ((this.field1266 + 4900) % 5000 == this.field1259) {
                    throw new IOException();
                }
            }
            if (this.field1261 == null) {
                this.field1261 = this.field1263.method1438(this, 3);
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
                        if (this.field1266 == this.field1259) {
                            if (this.field1267) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1266;
                        if (this.field1259 >= this.field1266) {
                            var4 = this.field1259 - this.field1266;
                        } else {
                            var4 = 5000 - this.field1266;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1260.write(this.field1265, var3, var4);
                    } catch (IOException var12) {
                        this.field1268 = true;
                    }
                    this.field1266 = (this.field1266 + var4) % 5000;
                    try {
                        if (this.field1266 == this.field1259) {
                            this.field1260.flush();
                        }
                    } catch (IOException var11) {
                        this.field1268 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1271 != null) {
                        this.field1271.close();
                    }
                    if (this.field1260 != null) {
                        this.field1260.close();
                    }
                    if (this.field1272 != null) {
                        this.field1272.close();
                    }
                } catch (IOException var10) {
                }
                this.field1265 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method848((String) null, var15);
        }
    }
}
