package com.georgiev.petar;

public class MMLogo {
    private Renderer renderer;

    public MMLogo(Renderer renderer) {
        this.renderer = renderer;
    }

    // draw MentorMate logo
    public void drawMMLogo(int n) {
        // checking the input
        if(n<2 || n%2==0){
            System.out.println("Wrong Input!\nNumber is lower than 2 or even.\nPlease try another.");
            return;
        }

        int sidesDashesCount = n;
        int middleDashesCount = n;
        int asterixCount = n;

        //draw top half
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < 2; j++) {
                drawDash(sidesDashesCount);
                drawAsterix(asterixCount);
                drawDash(middleDashesCount);
                drawAsterix(asterixCount);
                drawDash(sidesDashesCount);
            }
            renderer.renderNewLine();
            sidesDashesCount--;
            asterixCount += 2;
            middleDashesCount -= 2;
        }

        middleDashesCount = 1;
        asterixCount = n;
        int middleAsterixCount = (asterixCount * 2) - 1;

        //draw bottom half
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < 2; j++) {
                drawDash(sidesDashesCount);
                drawAsterix(asterixCount);
                drawDash(middleDashesCount);
                drawAsterix(middleAsterixCount);
                drawDash(middleDashesCount);
                drawAsterix(asterixCount);
                drawDash(sidesDashesCount);
            }
            renderer.renderNewLine();
            sidesDashesCount--;
            middleAsterixCount -= 2;
            middleDashesCount += 2;
        }
    }

    // draw dash
    private void drawDash(int n) {
        if (n == 0)
            return;

        for (int i = 0; i < n; i++) {
            renderer.render("-");
        }
    }

    // draw asterix
    private void drawAsterix(int n) {
        if (n == 0)
            return;

        for (int i = 0; i < n; i++) {
            renderer.render("*");
        }
    }
}
