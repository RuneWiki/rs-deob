package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ad")
public final class class31 implements Runnable {

    @ObfuscatedName("ad.t")
    public InputStream field354;

    @ObfuscatedName("ad.n")
    public OutputStream field350;

    @ObfuscatedName("ad.q")
    public Socket field351;

    @ObfuscatedName("ad.h")
    public boolean field356 = false;

    @ObfuscatedName("ad.k")
    public class34 field352;

    @ObfuscatedName("ad.r")
    public class37 field357;

    @ObfuscatedName("ad.l")
    public byte[] field349;

    @ObfuscatedName("ad.i")
    public int field355 = 0;

    @ObfuscatedName("ad.e")
    public int field353 = 0;

    @ObfuscatedName("ad.a")
    public boolean field358 = false;

    public class31(Socket arg0, class34 arg1) throws IOException {
        this.field352 = arg1;
        this.field351 = arg0;
        this.field351.setSoTimeout(30000);
        this.field351.setTcpNoDelay(true);
        this.field354 = this.field351.getInputStream();
        this.field350 = this.field351.getOutputStream();
    }

    @ObfuscatedName("ad.h(I)V")
    public void method394() {
        if (this.field356) {
            return;
        }
        synchronized (this) {
            this.field356 = true;
            this.notifyAll();
        }
        if (this.field357 != null) {
            while (this.field357.field500 == 0) {
                Statics.method101(1L);
            }
            if (this.field357.field500 == 1) {
                try {
                    ((Thread) this.field357.field501).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field357 = null;
    }

    public void finalize() {
        this.method394();
    }

    @ObfuscatedName("ad.k(B)I")
    public int method374() throws IOException {
        return this.field356 ? 0 : this.field354.read();
    }

    @ObfuscatedName("ad.r(I)I")
    public int method375() throws IOException {
        return this.field356 ? 0 : this.field354.available();
    }

    @ObfuscatedName("ad.l([BIIB)V")
    public void method376(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field356) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field354.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ad.i([BIII)V")
    public void method377(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field356) {
            return;
        }
        if (this.field358) {
            this.field358 = false;
            throw new IOException();
        }
        if (this.field349 == null) {
            this.field349 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field349[this.field353] = arg0[arg1 + var5];
                this.field353 = (this.field353 + 1) % 5000;
                if ((this.field355 + 4900) % 5000 == this.field353) {
                    throw new IOException();
                }
            }
            if (this.field357 == null) {
                this.field357 = this.field352.method420(this, 3);
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
                        if (this.field355 == this.field353) {
                            if (this.field356) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field355;
                        if (this.field353 >= this.field355) {
                            var4 = this.field353 - this.field355;
                        } else {
                            var4 = 5000 - this.field355;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field350.write(this.field349, var3, var4);
                    } catch (IOException var12) {
                        this.field358 = true;
                    }
                    this.field355 = (this.field355 + var4) % 5000;
                    try {
                        if (this.field355 == this.field353) {
                            this.field350.flush();
                        }
                    } catch (IOException var11) {
                        this.field358 = true;
                    }
                    continue;
                }
                try {
                    if (this.field354 != null) {
                        this.field354.close();
                    }
                    if (this.field350 != null) {
                        this.field350.close();
                    }
                    if (this.field351 != null) {
                        this.field351.close();
                    }
                } catch (IOException var10) {
                }
                this.field349 = null;
                break;
            }
        } catch (Exception var15) {
            class169.method255((String) null, var15);
        }
    }
}
