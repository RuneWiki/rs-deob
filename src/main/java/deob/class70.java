package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("be")
public final class class70 implements Runnable {

    @ObfuscatedName("be.a")
    public InputStream field1291;

    @ObfuscatedName("be.x")
    public OutputStream field1288;

    @ObfuscatedName("be.e")
    public Socket field1286;

    @ObfuscatedName("be.r")
    public boolean field1290 = false;

    @ObfuscatedName("be.p")
    public class74 field1287;

    @ObfuscatedName("be.n")
    public class79 field1296;

    @ObfuscatedName("be.o")
    public byte[] field1284;

    @ObfuscatedName("be.l")
    public int field1285 = 0;

    @ObfuscatedName("be.t")
    public int field1292 = 0;

    @ObfuscatedName("be.q")
    public boolean field1293 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1287 = arg1;
        this.field1286 = arg0;
        this.field1286.setSoTimeout(30000);
        this.field1286.setTcpNoDelay(true);
        this.field1291 = this.field1286.getInputStream();
        this.field1288 = this.field1286.getOutputStream();
    }

    @ObfuscatedName("be.r(I)V")
    public void method1357() {
        if (this.field1290) {
            return;
        }
        synchronized (this) {
            this.field1290 = true;
            this.notifyAll();
        }
        if (this.field1296 != null) {
            while (this.field1296.field1414 == 0) {
                class126.method164(1L);
            }
            if (this.field1296.field1414 == 1) {
                try {
                    ((Thread) this.field1296.field1420).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1296 = null;
    }

    public void finalize() {
        this.method1357();
    }

    @ObfuscatedName("be.p(I)I")
    public int method1359() throws IOException {
        return this.field1290 ? 0 : this.field1291.read();
    }

    @ObfuscatedName("be.n(I)I")
    public int method1360() throws IOException {
        return this.field1290 ? 0 : this.field1291.available();
    }

    @ObfuscatedName("be.o([BIIB)V")
    public void method1361(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1290) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1291.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("be.l([BIII)V")
    public void method1362(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1290) {
            return;
        }
        if (this.field1293) {
            this.field1293 = false;
            throw new IOException();
        }
        if (this.field1284 == null) {
            this.field1284 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1284[this.field1292] = arg0[arg1 + var5];
                this.field1292 = (this.field1292 + 1) % 5000;
                if ((this.field1285 + 4900) % 5000 == this.field1292) {
                    throw new IOException();
                }
            }
            if (this.field1296 == null) {
                this.field1296 = this.field1287.method1454(this, 3);
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
                        if (this.field1292 == this.field1285) {
                            if (this.field1290) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1285;
                        if (this.field1292 >= this.field1285) {
                            var4 = this.field1292 - this.field1285;
                        } else {
                            var4 = 5000 - this.field1285;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1288.write(this.field1284, var3, var4);
                    } catch (IOException var12) {
                        this.field1293 = true;
                    }
                    this.field1285 = (this.field1285 + var4) % 5000;
                    try {
                        if (this.field1292 == this.field1285) {
                            this.field1288.flush();
                        }
                    } catch (IOException var11) {
                        this.field1293 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1291 != null) {
                        this.field1291.close();
                    }
                    if (this.field1288 != null) {
                        this.field1288.close();
                    }
                    if (this.field1286 != null) {
                        this.field1286.close();
                    }
                } catch (IOException var10) {
                }
                this.field1284 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method1333((String) null, var15);
        }
    }
}
