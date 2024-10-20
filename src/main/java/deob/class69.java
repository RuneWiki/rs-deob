package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bw")
public final class class69 implements Runnable {

    @ObfuscatedName("bw.v")
    public InputStream field1260;

    @ObfuscatedName("bw.f")
    public OutputStream field1270;

    @ObfuscatedName("bw.n")
    public Socket field1261;

    @ObfuscatedName("bw.c")
    public boolean field1262 = false;

    @ObfuscatedName("bw.r")
    public class73 field1263;

    @ObfuscatedName("bw.k")
    public class78 field1267;

    @ObfuscatedName("bw.e")
    public byte[] field1265;

    @ObfuscatedName("bw.q")
    public int field1266 = 0;

    @ObfuscatedName("bw.u")
    public int field1259 = 0;

    @ObfuscatedName("bw.s")
    public boolean field1268 = false;

    public class69(Socket arg0, class73 arg1) throws IOException {
        this.field1263 = arg1;
        this.field1261 = arg0;
        this.field1261.setSoTimeout(30000);
        this.field1261.setTcpNoDelay(true);
        this.field1260 = this.field1261.getInputStream();
        this.field1270 = this.field1261.getOutputStream();
    }

    @ObfuscatedName("bw.r(B)V")
    public void method1413() {
        if (this.field1262) {
            return;
        }
        synchronized (this) {
            this.field1262 = true;
            this.notifyAll();
        }
        if (this.field1267 != null) {
            while (this.field1267.field1388 == 0) {
                class125.method2683(1L);
            }
            if (this.field1267.field1388 == 1) {
                try {
                    ((Thread) this.field1267.field1385).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1267 = null;
    }

    public void finalize() {
        this.method1413();
    }

    @ObfuscatedName("bw.k(I)I")
    public int method1412() throws IOException {
        return this.field1262 ? 0 : this.field1260.read();
    }

    @ObfuscatedName("bw.e(B)I")
    public int method1414() throws IOException {
        return this.field1262 ? 0 : this.field1260.available();
    }

    @ObfuscatedName("bw.q([BIIB)V")
    public void method1415(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1262) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1260.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bw.u([BIII)V")
    public void method1416(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1262) {
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
            if (this.field1267 == null) {
                this.field1267 = this.field1263.method1522(this, 3);
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
                            if (this.field1262) {
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
                        this.field1270.write(this.field1265, var3, var4);
                    } catch (IOException var12) {
                        this.field1268 = true;
                    }
                    this.field1266 = (this.field1266 + var4) % 5000;
                    try {
                        if (this.field1266 == this.field1259) {
                            this.field1270.flush();
                        }
                    } catch (IOException var11) {
                        this.field1268 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1260 != null) {
                        this.field1260.close();
                    }
                    if (this.field1270 != null) {
                        this.field1270.close();
                    }
                    if (this.field1261 != null) {
                        this.field1261.close();
                    }
                } catch (IOException var10) {
                }
                this.field1265 = null;
                break;
            }
        } catch (Exception var15) {
            class79.method811((String) null, var15);
        }
    }
}
