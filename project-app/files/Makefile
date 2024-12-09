EXEC=accelerometer-app
CFLAGS = -Wall -O2

all: $(EXEC)

$(EXEC): accelerometer-app.c
	$(CC) $< $(CFLAGS) -o $(EXEC) 

clean:
	rm -f $(EXEC) *.o