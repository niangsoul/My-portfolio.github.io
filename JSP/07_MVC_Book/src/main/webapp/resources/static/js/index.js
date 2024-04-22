
// (p) 메인페이지 js 설정
        // BANNER
        // (p) 배너 슬라이드 작동 
        const swiper_banner=new Swiper('.wrapper>main>section.banner-section>.swiper',{
            direction : 'horizontal',
            autoplay : {
                delay:2000,
                pauseOnMouseEnter : true,
            },
            loop :true,
            pagination : {
                el : '.swiper-pagination',
                clickable :'true',
                type:'bullets', // bullets,progressbar,fraction..
            },
            navigation : {
                nextEl : '.swiper-button-next',
                prevEl : '.swiper-button-prev',
            },
            mousewheel : false,
            effect : 'scroll',  //fade
        });

        //MULTISLIDER
        // (p) 미니 슬라이드 작동 
        const multislider =  new Swiper('.wrapper>main>section.multi-slider>.swiper',{
            direction : 'horizontal',
            autoplay:{
                delay:2000,
                disableOnInteraction: false,
            },
            loop : true,
            slidesPerView :4,
            centeredSlides : true,
            pagination : {
                el : '.swiper-pagination',
                clickable :'true',
                type:'bullets', // bullets,progressbar,fraction..
            },
            navigation : {
                nextEl : '.swiper-button-next',
                prevEl : '.swiper-button-prev',
            },

        });

        //마우스 hover시 autoplay Stop
        const swiperEl = document.querySelector('.wrapper>main>section.multi-slider>.swiper');
        swiperEl.addEventListener('mouseover',function(){
            multislider.autoplay.stop();
        })
        swiperEl.addEventListener('mouseleave',function(){
            multislider.autoplay.start();
        })
        //centered Slider가 아닌 다른 slider 클릭시 해당 slider를 Center로 맞추기
        const multislider_slideEls = document.querySelectorAll('.wrapper>main>section.multi-slider>.swiper>.swiper-wrapper>.swiper-slide');
        multislider_slideEls.forEach(el=>{
            
            el.addEventListener('click',function(e){
                console.log(e.target);
                
                multislider_slideEls.forEach(etcEl=>{
                    etcEl.classList.remove('swiper-slide-active');
                    etcEl.classList.remove('swiper-slide-next');
                    etcEl.classList.remove('swiper-slide-prev');
                })

                el.classList.add('swiper-slide-active');
            })

        }) 