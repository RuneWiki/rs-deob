package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("aj")
public final class class32 implements Runnable {

    @ObfuscatedName("aj.q")
    public InputStream field358;

    @ObfuscatedName("aj.l")
    public OutputStream field361;

    @ObfuscatedName("aj.a")
    public Socket field359;

    @ObfuscatedName("aj.o")
    public boolean field366 = false;

    @ObfuscatedName("aj.c")
    public class35 field363;

    @ObfuscatedName("aj.h")
    public class38 field362;

    @ObfuscatedName("aj.r")
    public byte[] field365;

    @ObfuscatedName("aj.d")
    public int field364 = 0;

    @ObfuscatedName("aj.k")
    public int field360 = 0;

    @ObfuscatedName("aj.u")
    public boolean field357 = false;

    public class32(Socket arg0, class35 arg1) throws IOException {
        this.field363 = arg1;
        this.field359 = arg0;
        this.field359.setSoTimeout(30000);
        this.field359.setTcpNoDelay(true);
        this.field358 = this.field359.getInputStream();
        this.field361 = this.field359.getOutputStream();
    }

    @ObfuscatedName("aj.a(B)V")
    public void method366() {
        if (this.field366) {
            return;
        }
        synchronized (this) {
            this.field366 = true;
            this.notifyAll();
        }
        if (this.field362 != null) {
            while (this.field362.field508 == 0) {
                class68.method86(1L);
            }
            if (this.field362.field508 == 1) {
                try {
                    ((Thread) this.field362.field514).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field362 = null;
    }

    public void finalize() {
        this.method366();
    }

    @ObfuscatedName("aj.o(B)I")
    public int method368() throws IOException {
        return this.field366 ? 0 : this.field358.read();
    }

    @ObfuscatedName("aj.c(I)I")
    public int method369() throws IOException {
        return this.field366 ? 0 : this.field358.available();
    }

    @ObfuscatedName("aj.h([BIII)V")
    public void method370(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field366) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field358.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("aj.r([BIIB)V")
    public void method371(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field366) {
            return;
        }
        if (this.field357) {
            this.field357 = false;
            throw new IOException();
        }
        if (this.field365 == null) {
            this.field365 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field365[this.field360] = arg0[arg1 + var5];
                this.field360 = (this.field360 + 1) % 5000;
                if ((this.field364 + 4900) % 5000 == this.field360) {
                    throw new IOException();
                }
            }
            if (this.field362 == null) {
                this.field362 = this.field363.method426(this, 3);
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
                        if (this.field364 == this.field360) {
                            if (this.field366) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field364;
                        if (this.field360 >= this.field364) {
                            var4 = this.field360 - this.field364;
                        } else {
                            var4 = 5000 - this.field364;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field361.write(this.field365, var3, var4);
                    } catch (IOException var12) {
                        this.field357 = true;
                    }
                    this.field364 = (this.field364 + var4) % 5000;
                    try {
                        if (this.field364 == this.field360) {
                            this.field361.flush();
                        }
                    } catch (IOException var11) {
                        this.field357 = true;
                    }
                    continue;
                }
                try {
                    if (this.field358 != null) {
                        this.field358.close();
                    }
                    if (this.field361 != null) {
                        this.field361.close();
                    }
                    if (this.field359 != null) {
                        this.field359.close();
                    }
                } catch (IOException var10) {
                }
                this.field365 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method244((String) null, var15);
        }
    }
}
